package proxy.some_cool_media_library;

/**
 * @author Semenov Alexey
 * Видеофайл
 */
public class Video {
    public String id;
    public String title;
    public String data;

    Video(String id, String title) {
        this.id = id;
        this.title = title;
        this.data = "Random video.";
    }
}
