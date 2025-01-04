import java.io.*;
import javax.sound.sampled.*;

public class AudioPlayer {
    public static void main(String[] args) {
        try{ 
            String path = "/home/rughimire/workspace/ku/handsout/graphics/sample.wav";
            // open and convert into audio stream
            File audioFile = new File(path);
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(audioFile);
            // audio meta/line information 
            AudioFormat audioFormat = audioInputStream.getFormat();
            DataLine.Info audioInfo = new DataLine.Info(Clip.class, audioFormat);
            // clip
            Clip audioClip = (Clip) AudioSystem.getLine(audioInfo);
            // play
            audioClip.open(audioInputStream);
            audioClip.start();
            Thread.sleep(20000);
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
