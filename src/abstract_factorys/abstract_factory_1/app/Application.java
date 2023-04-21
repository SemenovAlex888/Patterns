package abstract_factorys.abstract_factory_1.app;

import abstract_factorys.abstract_factory_1.buttons.Button;
import abstract_factorys.abstract_factory_1.checkboxes.Checkbox;
import abstract_factorys.abstract_factory_1.factories.GUIFactory;

/**
 * @author Semenov Alexey
 */
public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}