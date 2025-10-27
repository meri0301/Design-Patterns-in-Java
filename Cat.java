import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;

public class Cat implements Animal {
    private final SoundStrategy soundBehavior;

    public Cat(SoundStrategy soundBehavior) {
        this.soundBehavior = soundBehavior;
    }

    @Override
    public void performSound() throws UnsupportedAudioFileException, IOException {
        System.out.println("--- Cat is preparing to make a sound ---");
        soundBehavior.makeSound();
    }
}