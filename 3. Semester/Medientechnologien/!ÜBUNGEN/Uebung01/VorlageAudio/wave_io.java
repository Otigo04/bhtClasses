package audio;

import java.io.IOException;

public class wave_io {
	
	public static void main(String[] args) {
	
		int samples = 10;
		int validBits = 0;
		long sampleRate = 0;
		long numFrames = 0; 
		int numChannels = 0;

		String inFilename = null;
		String outFilename = null;
		
		WavFile readWavFile = null;
		
		if (args.length < 1) {
			try { throw new WavFileException("At least one filename specified  (" + args.length + ")"); }
			catch (WavFileException e1) { e1.printStackTrace(); }
		}
	
		
		// ***********************************************************************
		// Ab hier: Wenn nur eine Eingabedatei (1 Argument) genutzt wird 
		
		try {
			inFilename=args[0];
			
			// Zugriff auf die einzelne Samples im Array readWavFile.sound[i]
			readWavFile = WavFile.read_wav(inFilename);
			
			// Sample (Bytes) pro Kanal (z. B. links und rechts bei Stereo). 
			numFrames = readWavFile.getNumFrames(); 
			
			// Anzahl der Kanaäle (mono=1/stereo=2)
			numChannels = readWavFile.getNumChannels();
			
			// Anzahl Abtastpunkte
			samples = (int) numFrames*numChannels;
			
			// Bitszahl
			validBits = readWavFile.getValidBits();
			
			// Abtastrate/Samplerate 
			sampleRate = readWavFile.getSampleRate();
			
			
			// Implementierung
			for (int i=0; i<readWavFile.sound.length; i++) {
				System.out.println(readWavFile.sound[i]);
			}
			
			
		} catch (IOException | WavFileException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		if (args.length == 1) 
			System.exit(0);
			
		
		// ***********************************************************************
		// Ab hier, wenn eine Ausgabedatei (2 Argument) gespeichert werden soll 
		
		outFilename=args[1];

		
		
		// Implementierung
		
		
		// Speicherung der Ausgabedatei (2.Argument)
		try {
			WavFile.write_wav(outFilename, numChannels, numFrames, validBits, sampleRate, readWavFile.sound);
		} catch (IOException | WavFileException e) {
			e.printStackTrace();
		}
	}
}
