import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Musica {

    private Clip clip;

    public void tocar() {
        try {
            File arquivo = new File("musicapou.wav");

            AudioInputStream audio = AudioSystem.getAudioInputStream(arquivo);

            clip = AudioSystem.getClip();
            clip.open(audio);

            clip.loop(Clip.LOOP_CONTINUOUSLY);
            clip.start();

        } catch (Exception e) {
    e.printStackTrace();
}
    }

    public void parar() {
        if (clip != null) {
            clip.stop();
            clip.close();
        }
    }
}