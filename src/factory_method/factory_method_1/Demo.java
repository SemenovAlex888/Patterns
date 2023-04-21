package factory_method.factory_method_1;

import factory_method.factory_method_1.factory.Dialog;
import factory_method.factory_method_1.factory.HtmlDialog;
import factory_method.factory_method_1.factory.WindowsDialog;

/**
 * https://refactoring.guru/ru/design-patterns/factory-method/java/example
 * @author Semenov Alexey
 */
public class Demo {
    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    /**
     * Приложение создаёт определённую фабрику в зависимости от конфигурации или
     * окружения.
     */
    static void configure() {
        if (System.getProperty("os.name").equals("Windows 10")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

    /**
     * Весь остальной клиентский код работает с фабрикой и продуктами только
     * через общий интерфейс, поэтому для него неважно какая фабрика была
     * создана.
     */
    static void runBusinessLogic() {
        dialog.renderWindow();
    }
}
