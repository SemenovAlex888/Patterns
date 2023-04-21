package observers.observer_1.listeners;

import java.io.File;

/**
 * @author Semenov Alexey
 */
public interface EventListener {

    void update(String eventType, File file);
}
