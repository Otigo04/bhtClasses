package cgg.a02;

import cgg.Image;
import tools.Color;
import static tools.Functions.*;

public class Main {
    public static void main(String[] args) {
        int w = 400, h = 400;
        Image image = new Image(w, h);
        Camera cam = new Camera(Math.PI/3, w, h);
        Sphere[] sph = new Sphere[15];
        for (int i=0; i<15; i++) {
            double x = -5 + Math.random()*10;
            double y = -5 + Math.random()*10;
            double z = -5 - Math.random()*5;
            sph[i] = new Sphere(vec3(x,y,z), 0.5 + Math.random()*0.5, new Color(Math.random(),Math.random(),Math.random()));
        }
        Raytracer tracer = new Raytracer(cam, sph);
        for (int x=0; x<w; x++) for(int y=0; y<h; y++) {
            image.setPixel(x, y, tracer.getColor(vec2(x,y)));
        }
        image.writePNG("a02-spheres");
    }
}