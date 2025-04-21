package cgg.a02;

import tools.Vec3;
import tools.Vec2;
import static tools.Functions.*;

public class Camera {
    private final double alpha;
    private final int width, height;
    private final double aspect;
    private final double screenDist;

    public Camera(double alpha, int width, int height) {
        this.alpha = alpha;
        this.width = width;
        this.height = height;
        this.aspect = (double) width / height;
        
        this.screenDist = 1.0 / Math.tan(alpha / 2.0);
    }

    public Ray generateRay(Vec2 p) {
        
        double ndcX = (2 * p.x() / width - 1) * aspect;
        double ndcY = 1 - 2 * p.y() / height;
        Vec3 dir = normalize(vec3(ndcX, ndcY, -screenDist));
        return new Ray(vec3(0,0,0), dir);
        // Hilfe von ChatGPT war hier dabei
    }
}