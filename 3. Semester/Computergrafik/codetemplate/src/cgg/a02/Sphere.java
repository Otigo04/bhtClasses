package cgg.a02;

import tools.Color;
import static tools.Functions.*;
import tools.Vec3;

public class Sphere {
    private final Vec3 center;
    private final double radius;
    private final Color color;

    public Sphere(Vec3 center, double radius, Color color) {
        this.center = center;
        this.radius = radius;
        this.color = color;
    }

    public Hit intersect(Ray r) {
        Vec3 L = subtract(r.ursprung(), center);
        double a = dot(r.direction(), r.direction());
        double b = 2 * dot(r.direction(), L);
        double c = dot(L, L) - radius * radius;
        double disc = b*b - 4*a*c;
        if (disc < 0) return null;
        double sqrtD = Math.sqrt(disc);
        double t0 = (-b - sqrtD) / (2*a);
        double t1 = (-b + sqrtD) / (2*a);
        double t = t0;
        if (t < r.tMin() || t > r.tMax()) {
            t = t1;
            if (t < r.tMin() || t > r.tMax()) return null;
        }
        // Hilfe von GPT war dabei
        Vec3 pos = r.pointAt(t);
        Vec3 normal = normalize(subtract(pos, center));
        return new Hit(t, pos, normal, color);
    }
}