package states.states_1;

import states.states_1.ui.Player;
import states.states_1.ui.UI;

/**
 * @author Semenov Alexey
 */
public class Demo {
    public static void main(String[] args) {
        Player player = new Player();
        UI ui = new UI(player);
        ui.init();
    }
}
