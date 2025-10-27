import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;
import java.net.URL;

public class MeowStrategy implements SoundStrategy {

    private final String soundPath = "/cat.wav";

    @Override
    public void makeSound() throws UnsupportedAudioFileException, IOException {
        System.out.println("[Strategy] Cat sound activated...");
        URL audioUrl = getClass().getResource(soundPath);

        if (audioUrl != null) {
            // Pass the URL to the SoundPlayer
            SoundPlayer.playWavFile(audioUrl);
        } else {
            System.err.println("  [Error] Resource not found on classpath: " + soundPath);
        }
    }
}
