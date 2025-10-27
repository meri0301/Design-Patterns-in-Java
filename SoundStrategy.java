import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;

public interface SoundStrategy {
    void makeSound() throws UnsupportedAudioFileException, IOException;
}
