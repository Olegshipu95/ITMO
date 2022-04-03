package collections;
import java.util.HashMap;

import commands.AbstractCommand;
import commands.system.*;
//import lombok.var;

public class CommandCollection {
    public static HashMap<String, AbstractCommand> commandColl = new HashMap<>();

    public static void commandManager() {
        commandColl.put("add",new Add());
        commandColl.put("averageOfMinutes",new AverageOfMinutesOfWaiting());
        commandColl.put("clear",new Clear());
        commandColl.put("execute_script",new Execute_script());
        commandColl.put("exit",new Exit());
        commandColl.put("help",new Help());
        commandColl.put("history",new History());
        commandColl.put("info",new Info());
        commandColl.put("printAscending",new PrintAscending());
        commandColl.put("remove_by_id",new Remove_by_id());
        commandColl.put("remove_at",new RemoveAt());
        commandColl.put("remove_lower",new RemoveLower());
        commandColl.put("save",new Save());
        commandColl.put("show",new Show());
        commandColl.put("sumOfMinutesOfWaiting",new SumOfMinutesOfWaiting());
        commandColl.put("updateId",new UpdateId());
    }
}
