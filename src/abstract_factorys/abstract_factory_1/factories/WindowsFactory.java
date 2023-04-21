package abstract_factorys.abstract_factory_1.factories;

import abstract_factorys.abstract_factory_1.buttons.Button;
import abstract_factorys.abstract_factory_1.buttons.WindowsButton;
import abstract_factorys.abstract_factory_1.checkboxes.Checkbox;
import abstract_factorys.abstract_factory_1.checkboxes.WindowsCheckbox;

/**
 * @author Semenov Alexey
 */
public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
