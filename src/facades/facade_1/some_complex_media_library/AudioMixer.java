package facades.facade_1.some_complex_media_library;

import java.io.File;

/**
 * @author Semenov Alexey
 */
public class AudioMixer {
    public File fix(VideoFile result){
        System.out.println("AudioMixer: fixing audio...");
        return new File("tmp");
    }
}
