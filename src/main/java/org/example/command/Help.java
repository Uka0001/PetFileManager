package org.example.command;

import java.util.List;
import java.util.Map;

public class Help extends Command {

    public Help(Context context) {
        super(context);
    }

    @Override
    public String execute(List<String> args) {
        Map<String, Command> commands = context.getCommandMap();

        StringBuilder result = new StringBuilder("Available commands:\n");
        if (commands != null) {
            for (String each : commands.keySet()) {
                result.append(each).append("\n");
            }
        }
        return result.toString() + "\n ! Don`t miss to enter needed argument " +
                "after the command name split by enter ! \n Choose the command and let the party started! :)";
    }
}
