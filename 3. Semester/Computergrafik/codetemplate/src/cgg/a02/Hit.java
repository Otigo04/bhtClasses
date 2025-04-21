package cgg.a02;

import tools.Color;
import tools.Vec3;

public record Hit(double t, Vec3 position, Vec3 normal, Color color) {
    @Override public String toString() {
        return String.format("Hit[t=%.2f, point=%s, normal=%s, color=%s]", t, position, normal, color); // Teilhilfe von ChatGPT (Die t=%.2f usw.)
    }
}