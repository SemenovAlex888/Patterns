package template_method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Semenov Alexey
 * Демо-класс. Здесь всё сводится воедино.
 * https://refactoring.guru/ru/design-patterns/template-method/java/example
 */
public class Demo {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Network network = null;
        System.out.println("Input user name: ");
        String userName = reader.readLine();
        System.out.println("Input password: ");
        String password = reader.readLine();

        // Вводим сообщение.
        System.out.println("Input message: ");
        String message = reader.readLine();

        System.out.println("\nChoose social network for posting message.\n" +
                "1 - Facebook\n" +
                "2 - Twitter");
        int choice = Integer.parseInt(reader.readLine());

        // Создаем сетевые объекты и публикуем пост.
        if (choice == 1) {
            network = new Facebook(userName, password);
        } else if (choice == 2){
            network = new Twitter(userName, password);
        }

        network.post(message);
    }
}
