package collections;

import commands.Command;
import commands.CommandData;
import commands.system.*;
import java.util.HashMap;

public class CommandCollection {
    public static HashMap<String, Command> commandColl = new HashMap<>();
    public static HashMap<String, String> clientCommands = new HashMap<>();
    public static HashMap<String, CommandData> serverCommands = new HashMap<>();

    public static void commandManager() {
        new Exit();
        new Help();
        new History();
        new Connect();
        new ExecuteScript();
    }


}