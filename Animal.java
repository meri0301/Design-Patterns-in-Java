import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;

public interface Animal {
    void performSound() throws UnsupportedAudioFileException, IOException;
}
