package abstract_factorys.abstract_factory_1.factories;

import abstract_factorys.abstract_factory_1.buttons.Button;
import abstract_factorys.abstract_factory_1.buttons.MacOSButton;
import abstract_factorys.abstract_factory_1.checkboxes.Checkbox;
import abstract_factorys.abstract_factory_1.checkboxes.MacOSCheckbox;

/**
 * @author Semenov Alexey
 */
public class MacOSFactory  implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
