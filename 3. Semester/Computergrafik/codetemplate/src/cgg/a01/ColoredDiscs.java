package cgg.a01;

import java.util.ArrayList;
import java.util.List;
import tools.Color;
import static tools.Color.*;
import static tools.Functions.vec2;
import tools.Vec2;

public class ColoredDiscs implements tools.ISampler {

    private List<ColorDisc> discs;

    public ColoredDiscs() {
        discs = new ArrayList<>();
        int imageWidth = 400;
        int imageHeight = 400;

        
        int cirlceCount = 10;
        double beginning = 1;
        for(int j = 0; j < 3; j++) {
            double radius = 10;
            for (int i = 0; i < cirlceCount; i++) {
                double spacing = 10;
                beginning += 10;
                double x = beginning + spacing;
                double y = beginning + spacing;
                radius += 5; 
                Color color = new Color(Math.random(), Math.random(), Math.random());
                discs.add(new ColorDisc(vec2(x, y), radius, color));
                
            }
        }
    
    }

    @Override
    public Color getColor(Vec2 p) {

        for (ColorDisc disc : discs) {
            Color c = disc.getColor(p);
            if (!c.equals(black)) {
                return c;
            }
        }
        // Hintrgrundfarbe
        return black;
    }
}
