package bild;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import audio.WavFileException;

public final class bmp_io {
	
	public static void main(String[] args) throws IOException {
		
		String inFilename = null;
		String outFilename = null;
		
		// Klasse eineszPixels (Farbwerte RGB)
		PixelColor pc = null;		
		BmpImage bmp = null;

		if (args.length < 1) {
			System.out.println("At least one filename specified  (" + args.length + ")"); 
			System.exit(0);
		}
		
		
		// ***********************************************************************
		// Ab hier, wenn nur eine Eingabedatei (1 Argument) genutzt wird 
		
		try {
			inFilename = args[0];
			
			InputStream in = new FileInputStream(inFilename);
			
			// Zugriff auf Pixel mit bmp.image.getRgbPixel(x, y);
			// Setzen eines Pixels mit bmp.image.setRgbPixel(x, y, pc);
			bmp = BmpReader.read_bmp(in);
			
			// Implementierung
			
			
	
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		if (args.length == 1) 
			System.exit(0);
	
		
		// ***********************************************************************
		// Ab hier, wenn eine Ausgabedatei (2 Argument) gespeichert werden soll 

		outFilename = args[1];
		OutputStream out = new FileOutputStream(outFilename);
		
		// Implementierung
		
		
		// Speicherung 
		try {
			BmpWriter.write_bmp(out, bmp);
		}catch (IOException e) {
			e.printStackTrace();
		} finally {
			out.close();
		}
	}
}
