package cgg.a02;

import cgg.Image;
import tools.Color;
import static tools.Functions.*;

public class Main {
    public static void main(String[] args) {
        int w = 400, h = 400;
        Image image = new Image(w, h);
        Camera cam = new Camera(Math.PI/2, w, h);
        Sphere[] sph = new Sphere[20];
        
            double radius = 0.1;
        for (int u=0; u <1; u++) {
            double x = -4.5;
            double y = -4.5;
            double z = -5;
            for (int i=0; i<20; i++) {
                sph[i] = new Sphere(vec3(x,y,z), radius, new Color(Math.random(),Math.random(),Math.random()));
                x = x + 0.5;
                y = y + 0.5;
                radius = radius + 0.03;
        }
        
    }

        Raytracer tracer = new Raytracer(cam, sph);
        for (int x=0; x<w; x++) for(int y=0; y<h; y++) {
            image.setPixel(x, y, tracer.getColor(vec2(x,y)));
        }
        image.writePNG("a02-spheres");
    }
}