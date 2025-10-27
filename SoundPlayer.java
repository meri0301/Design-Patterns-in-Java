import javax.sound.sampled.*;
import java.io.IOException;
import java.net.URL;
import java.io.File;

public class SoundPlayer {

    public static void playWavFile(URL audioUrl) {
        System.out.println("  [System] Attempting to load URL: " + audioUrl);

        File audioFile = urlToFile(audioUrl);

        if (audioFile == null) {
            System.err.println("  [Error] Failed to convert URL to file path.");
            return;
        }

        if (!audioFile.exists()) {
            System.err.println("  [Error] Sound file not found at system path: " + audioFile.getAbsolutePath());
            return;
        }

        System.out.println("  [System] File found successfully at: " + audioFile.getAbsolutePath());

        try (
                AudioInputStream originalStream = AudioSystem.getAudioInputStream(audioFile);
        ) {
            AudioFormat originalFormat = originalStream.getFormat();

            AudioFormat targetFormat = new AudioFormat(
                    AudioFormat.Encoding.PCM_SIGNED,
                    44100.0F,
                    16,
                    originalFormat.getChannels(),
                    originalFormat.getChannels() * 2,
                    44100.0F,
                    false // false means Little-Endian (standard for PCs)
            );

            try (
                    AudioInputStream targetStream = AudioSystem.getAudioInputStream(targetFormat, originalStream);
            ) {
                Clip clip = AudioSystem.getClip();
                clip.open(targetStream);
                clip.start();

                System.out.println("  [System] Playing audio successfully...");

                clip.addLineListener(event -> {
                    if (event.getType() == LineEvent.Type.STOP) {
                        clip.close();
                    }
                });
            }


        } catch (UnsupportedAudioFileException e) {
            System.err.println("  [Error] Unsupported audio format. Convert to 16-bit PCM: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("  [Error] IO Exception: " + e.getMessage());
        } catch (LineUnavailableException e) {
            System.err.println("  [Error] Audio line unavailable: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.err.println("  [Error] Format conversion failed: " + e.getMessage());
        }
    }

    /**
     * Converts a URL (file:/C:/...) to a valid Windows File object,
     */
    private static File urlToFile(URL url) {
        if (!url.getProtocol().equalsIgnoreCase("file")) {
            return null; // Only handle file URLs
        }

        try {
            return new File(url.toURI());
        } catch (Exception e) {
            String path = url.getFile();

            if (path.startsWith("/") && path.charAt(2) == ':') {
                path = path.substring(1);
            }

            path = path.replace("%20", " ");

            return new File(path);
        }
    }
}
