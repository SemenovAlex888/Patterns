package factory_method.factory_method_1.factory;

import factory_method.factory_method_1.buttons.Button;
import factory_method.factory_method_1.buttons.WindowsButton;

/**
 * Диалог на элементах операционной системы.
 * @author Semenov Alexey
 */
public class WindowsDialog extends Dialog{

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
