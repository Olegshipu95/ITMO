package collections;
import java.util.HashMap;

import commands.system.*;
//import lombok.var;

public class CommandCollection {
    public static HashMap<String, Boolean> commandColl = new HashMap<>();

    public static void commandManager() {
        commandColl.put("add",new Add().function());
        commandColl.put("averageOfMinutes",new AverageOfMinutesOfWaiting().function());
        commandColl.put("clear",new Clear().function());
        commandColl.put("execute_script",new Execute_script().function());
        commandColl.put("exit",new Exit().function());
        commandColl.put("help",new Help().function());
        commandColl.put("history",new History().function());
        commandColl.put("info",new Info().function());
        commandColl.put("printAscending",new PrintAscending().function());
        commandColl.put("remove_by_id",new Remove_by_id().function());
        commandColl.put("remove_at",new RemoveAt().function());
        commandColl.put("remove_lower",new RemoveLower().function());
        commandColl.put("save",new Save().function());
        commandColl.put("show",new Show().function());
        commandColl.put("sumOfMinutesOfWaiting",new SumOfMinutesOfWaiting().function());
        commandColl.put("updateId",new UpdateId().function());
    }
}
