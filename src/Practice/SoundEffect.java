package Practice;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

public class SoundEffect {
    Clip clip;


    void setEffect(String soundidrectory) {
        try {
            File file = new File(soundidrectory);
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file);
            clip = AudioSystem.getClip();
            clip.open(audioInputStream);
        } catch (Exception e) {
            System.out.println("Error");
        }
    }

    void play() {
        clip.setFramePosition(0);
        clip.start();
    }
}
