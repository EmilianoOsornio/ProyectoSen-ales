/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete;

/**
 *
 * @author Emiliano
 */
import javax.sound.sampled.*;
import java.io.*;
import java.util.Scanner;
import java.io.File;
import java.net.URL;

 
public class RecordSound {
    // record duration, in milliseconds
    static long RECORD_TIME = 1000;  // 1 segundo
 
    // path of the wav file
    File wavFile = new File("Grabacion.wav");
 
    // format of audio file
    AudioFileFormat.Type fileType = AudioFileFormat.Type.WAVE;
 
    // the line from which audio data is captured
    TargetDataLine line;
 
    /**
     * Defines an audio format
     */
    AudioFormat getAudioFormat() {
        float sampleRate = 44100;
        int sampleSizeInBits = 16;
        int channels = 1;
        boolean signed = true;
        boolean bigEndian = false;
        AudioFormat format = new AudioFormat(sampleRate, sampleSizeInBits,
                                             channels, signed, bigEndian);
        return format;
    }
 
    /**
     * Captures the sound and record into a WAV file
     */
    void start() {
        try {
            AudioFormat format = getAudioFormat();
            DataLine.Info info = new DataLine.Info(TargetDataLine.class, format);
 
            // checks if system supports the data line
            if (!AudioSystem.isLineSupported(info)) {
                System.out.println("Line not supported");
                System.exit(0);
            }
            line = (TargetDataLine) AudioSystem.getLine(info);
            line.open(format);
            line.start();   // start capturing
 
            System.out.println("Start capturing...");
 
            AudioInputStream ais = new AudioInputStream(line);
 
            System.out.println("Habla ahora...");
 
            // start recording

            AudioSystem.write(ais, fileType, wavFile);
 
        } catch (LineUnavailableException ex) {
            ex.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
 
    /**
     * Closes the target data line to finish capturing and recording
     */
    void finish() {
        line.stop();
        line.close();
        System.out.println("Termino la grabación");
    } 
    /**
     * Entry to run the program
     */
    public static double[] mainRecord(int tiempo) {
        Scanner sc= new Scanner(System.in);
        boolean recording=false;
        String grabar;
        final RecordSound recorder = new RecordSound();
        RECORD_TIME=tiempo*1000; 
        // creates a new thread that waits for a specified
        // of time before stopping
        Thread stopper = new Thread(new Runnable() {
            public void run() {
                try {
                    Thread.sleep(RECORD_TIME);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
                recorder.finish();
            }
        });
        
        
        stopper.start();
        // start recording
        recorder.start();
        
        //Ahora leemos el archivo de audio generado
        System.out.println("Leyendo el archivo generado...");
        ReadSound rs= new ReadSound();
        //Recuperamos el archivo wave en un arreglo
        double[] data = rs.read("Grabacion.wav");                
        return data;
    }
}
