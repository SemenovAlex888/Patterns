package facades.facade_1;

import facades.facade_1.facade.VideoConversionFacade;

import java.io.File;

/**
 * @author Semenov Alexey
 * https://refactoring.guru/ru/design-patterns/facade/java/example
 */
public class Demo {
    public static void main(String[] args) {
        VideoConversionFacade converter = new VideoConversionFacade();
        File mp4Video = converter.convertVideo("youtubevideo.ogg", "mp4");
        // ...
    }
}
