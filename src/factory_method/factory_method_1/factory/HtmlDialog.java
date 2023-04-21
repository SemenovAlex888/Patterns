package factory_method.factory_method_1.factory;

import factory_method.factory_method_1.buttons.Button;
import factory_method.factory_method_1.buttons.HtmlButton;

/**
 * HTML-диалог.
 * @author Semenov Alexey
 */
public class HtmlDialog extends Dialog{

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
