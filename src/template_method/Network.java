package template_method;

/**
 * Базовый класс социальной сети.
 * @author Semenov Alexey
 */
public abstract class Network {

    String userName;
    String password;

    Network() {}

    /**
     * Публикация данных в любой сети.
     */
    public boolean post(String message) {
        // Проверка данных пользователя перед постом в соцсеть. Каждая сеть для
        // проверки использует разные методы.

        if(logIn(this.userName, this.password)) {
            // Отправка данных.
            boolean result = send(message.getBytes());
            logOut();
            return result;
        }
        return false;
    }

    abstract boolean logIn(String userName, String password);
    abstract boolean send(byte[] data);
    abstract void logOut();
}
