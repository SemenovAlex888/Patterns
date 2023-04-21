package commands.command_1.commands;

import java.util.Stack;

/**
 * @author Semenov Alexey
 */
public class CommandHistory  {
    private Stack<Command> history = new Stack<>();

    public void push(Command c) {
        history.push(c);
    }

    public Command pop() {
        return history.pop();
    }

    public boolean isEmpty() { return history.isEmpty(); }
}
