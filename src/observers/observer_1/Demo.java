package observers.observer_1;

import observers.observer_1.editor.Editor;
import observers.observer_1.listeners.EmailNotificationListener;
import observers.observer_1.listeners.LogOpenListener;

/**
 * @author Semenov Alexey
 * https://refactoring.guru/ru/design-patterns/observer/java/example
 */
public class Demo {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.events.subscribe("open", new LogOpenListener("/path/to/log/file.txt"));
        editor.events.subscribe("save", new EmailNotificationListener("admin@example.com"));

        try {
            editor.openFile("test.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
