package cgg.a02;

import static tools.Functions.*;
import tools.Vec3;

public record Ray(Vec3 ursprung, Vec3 direction, double tMin, double tMax) {
    
    public Ray {

    }

    public Ray(Vec3 pos, Vec3 dir) {
        this(pos, dir, 0, Double.MAX_VALUE);
    }

    public Vec3 pointAt(double t) {
        return add(ursprung, multiply(t, direction));
    
    }

    public boolean isValid(double t) {
        return (tMin <= t && t >= tMax);
    }




    
}
