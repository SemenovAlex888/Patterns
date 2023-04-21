package abstract_factorys.abstract_factory_1.factories;

import abstract_factorys.abstract_factory_1.buttons.Button;
import abstract_factorys.abstract_factory_1.checkboxes.Checkbox;

/**
 * @author Semenov Alexey
 */
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
