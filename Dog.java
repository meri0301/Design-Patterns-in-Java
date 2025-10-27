import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;

public class Dog implements Animal {
    private final SoundStrategy soundBehavior;

    public Dog(SoundStrategy soundBehavior) {
        this.soundBehavior = soundBehavior;
    }

    @Override
    public void performSound() throws UnsupportedAudioFileException, IOException {
        System.out.println("--- Dog is preparing to make a sound ---");
        soundBehavior.makeSound();
    }
}
