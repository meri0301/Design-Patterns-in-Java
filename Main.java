import javax.sound.sampled.UnsupportedAudioFileException;

void main() {
    AnimalFactory factory = new AnimalFactory();

    try {
        Animal cat = factory.createAnimal("cat");
        cat.performSound();
        Thread.sleep(2000); // Give time for the sound to play

        System.out.println("\n----------------------------------\n");


        Animal dog = factory.createAnimal("DOG");
        dog.performSound();
        Thread.sleep(2000); // Give time for the sound to play

        System.out.println("\n----------------------------------\n");

        // 4. Test Error Handling
        factory.createAnimal("snake");
    } catch (IllegalArgumentException e) {
        System.err.println("Caught expected error: " + e.getMessage());
    } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
    } catch (UnsupportedAudioFileException e) {
        throw new RuntimeException(e);
    } catch (IOException e) {
        throw new RuntimeException(e);
    } finally {
        // Final cleanup or message
        System.out.println("\nDemo finished.");
    }
}
