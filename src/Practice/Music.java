package Practice;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

public class Music {
    Clip clip;


    void setEffect(String music) {
        try {
            File file = new File(music);
            AudioInputStream inputMusic = AudioSystem.getAudioInputStream(file);
            clip = AudioSystem.getClip();
            clip.open(inputMusic);
        } catch (Exception e) {
            System.out.println("Error");
        }
    }

    void play() {
        clip.setFramePosition(0);
        clip.start();
    }

    void loop() {
        clip.loop(Clip.LOOP_CONTINUOUSLY);
    }

    void stop() {
        clip.stop();
        clip.close();
    }
}
