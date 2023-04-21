package factory_method.factory_method_1.buttons;

/**
 * Реализация HTML кнопок.
 * @author Semenov Alexey
 */
public class HtmlButton implements Button{

    public void render() {
        System.out.println("<button>Test Button</button>");
        onClick();
    }

    public void onClick() {
        System.out.println("Click! Button says - 'Hello World!'");
    }
}
