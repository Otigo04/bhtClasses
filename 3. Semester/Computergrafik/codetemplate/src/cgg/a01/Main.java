
package cgg.a01;

import cgg.Image;
import static tools.Color.*;
import static tools.Functions.*;


public class Main {

  public static void main(String[] args) {
    int width = 400;
    int height = 400;

    // This class instance defines the contents of the image.
    // Creates an image and iterates over all pixel positions inside the image.
    var disc = new ColorDisc(vec2(width / 2.0, height / 2.0), 100, red);
    var coloredDisc = new ColoredDiscs();

    var image1 = new Image(width, height);
    var image2 = new Image(width, height);
    var image3 = new Image(width, height);


    for (int x = 0; x != width; x++) {
      for (int y = 0; y != height; y++) {
        // Sets the color for one particular pixel.
        image3.setPixel(x, y, coloredDisc.getColor((vec2(x, y))));
        image1.setPixel(x, y, blue);
        image2.setPixel(x, y, disc.getColor((vec2(x, y))));
      }

    }

    // Write the image to disk.
    image3.writePNG("a01-coloreddiscs");
    image2.writePNG("a01-onedisc");
    image1.writePNG("a01-konstant");
  }
}

