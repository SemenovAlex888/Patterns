package commands.command_1.commands;

import commands.command_1.editor.Editor;

/**
 * @author Semenov Alexey
 */
public class CopyCommand extends Command {

    public CopyCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        editor.clipboard = editor.textField.getSelectedText();
        return false;
    }
}
