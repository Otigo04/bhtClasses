
package cgg.a01;

import tools.*;

import static tools.Color.black;
import static tools.Functions.length;
import static tools.Functions.subtract;

// Represents the contents of an image. Provides the same color for all pixels.
public record ColorDisc(Vec2 center, double radius, Color color) implements ISampler {
    @Override
    public Color getColor(Vec2 p) {
        if (length(subtract(p,center)) < radius) {
            return color;
        }
        else {
            return black;
        }
    }
}
