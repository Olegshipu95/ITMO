package collections;

import commands.Command;
import commands.system.*;

import java.util.HashMap;

public class CommandCollection {
    public static HashMap<String, Command> commandColl = new HashMap();
    public static HashMap<String, String> commandInfo = new HashMap();

    public static void commandManager() {
        new Add();
        new AverageOfMinutesOfWaiting();
        new Clear();
        new ExecuteScript();
        new Exit();
        new Help();
        new History();
        new Info();
        new PrintAscending();
        new RemoveById();
        new RemoveAt();
        new RemoveLower();
        new Save();
        new Show();
        new SumOfMinutesOfWaiting();
        new UpdateId();
    }


}