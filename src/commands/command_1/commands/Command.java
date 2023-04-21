package commands.command_1.commands;

import commands.command_1.editor.Editor;

/**
 * @author Semenov Alexey
 */
public abstract class Command  {
    public Editor editor;
    private String backup;

    Command(Editor editor) {
        this.editor = editor;
    }

    void backup() {
        backup = editor.textField.getText();
    }

    public void undo() {
        editor.textField.setText(backup);
    }

    public abstract boolean execute();
}
