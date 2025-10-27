import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;
import java.net.URL;

public class WoofStrategy implements SoundStrategy{

    private final String soundPath = "/dog.wav";

    @Override
    public void makeSound() throws UnsupportedAudioFileException, IOException {
        System.out.println("[Strategy] Dog sound activated...");
        URL audioUrl = getClass().getResource(soundPath);

        if (audioUrl != null) {
            SoundPlayer.playWavFile(audioUrl);
        } else {
            System.err.println("  [Error] Resource not found on classpath: " + soundPath);
        }
    }
}

