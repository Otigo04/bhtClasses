package cgg.a02;

import tools.Color;
import static tools.Functions.*;
import tools.Vec2;
import tools.Vec3;

public class Raytracer implements tools.ISampler {
    private final Camera camera;
    private final Sphere[] spheres;

    public Raytracer(Camera camera, Sphere[] spheres) {
        this.camera = camera;
        this.spheres = spheres;
    }

    @Override
    public Color getColor(Vec2 p) {
        Ray ray = camera.generateRay(p);
        Hit closestHit = null;
        for (Sphere s : spheres) {
            Hit h = s.intersect(ray);
            if (h != null && (closestHit == null || h.t() < closestHit.t())) {
                closestHit = h;
            }
        }
        if (closestHit != null) {
            return shade(closestHit);
        }
        return Color.gray;
    }


    private static Color shade(Hit hit) {
        Vec3 lightDir = normalize(vec3(1,1,0.5));
        Color ambient = multiply(0.1, hit.color());
        Color diffuse = multiply(0.9 * Math.max(0, dot(lightDir, hit.normal())), hit.color());
        return add(ambient, diffuse);
    }
}