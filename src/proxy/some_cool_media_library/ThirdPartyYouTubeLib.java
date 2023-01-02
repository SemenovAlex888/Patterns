package proxy.some_cool_media_library;

import java.util.HashMap;

/**
 * @author Semenov Alexey
 * Интерфейс удалённого сервиса
 */
public interface ThirdPartyYouTubeLib {

    HashMap<String, Video> popularVideos();
    Video getVideo(String videoId);
}
