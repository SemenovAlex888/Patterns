package commands.command_1;

import commands.command_1.editor.Editor;

/**
 * @author Semenov Alexey
 * https://refactoring.guru/ru/design-patterns/command/java/example
 */
public class Demo  {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.init();
    }
}
