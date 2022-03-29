package collections;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import commands.*;
//import lombok.var;

public class CommandCollection {
    public static HashMap<AbstractCommand, Boolean> commandColl = new HashMap<>();

    public static void commandManager() {

        /*Collections.addAll(commandColl, (add, averageOfMinutesOfWaiting, clear,
                execute_script, exit, help, history, info, printAscending, remove_by_id, remove_at, remove_lower,
                save, show, sumOfMinutesOfWaiting, updateId);*/
        Add add = new Add();
        commandColl.put(add,add.function());
        AverageOfMinutesOfWaiting averageOfMinutesOfWaiting = new AverageOfMinutesOfWaiting();
        commandColl.put(add,add.function());
        Clear clear = new Clear();
        commandColl.put(add,add.function());
        Execute_script execute_script = new Execute_script();
        commandColl.put(add,add.function());
        Exit exit = new Exit();
        commandColl.put(add,add.function());
        Help help = new Help();
        commandColl.put(add,add.function());
        History history = new History();
        commandColl.put(add,add.function());
        Info info = new Info();
        commandColl.put(add,add.function());
        PrintAscending printAscending = new PrintAscending();
        commandColl.put(add,add.function());
        Remove_by_id remove_by_id = new Remove_by_id();
        commandColl.put(add,add.function());
        RemoveAt remove_at = new RemoveAt();
        commandColl.put(add,add.function());
        RemoveLower remove_lower = new RemoveLower();
        commandColl.put(add,add.function());
        Save save = new Save();
        commandColl.put(add,add.function());
        Show show = new Show();
        commandColl.put(add,add.function());
        SumOfMinutesOfWaiting sumOfMinutesOfWaiting = new SumOfMinutesOfWaiting();
        commandColl.put(add,add.function());
        UpdateId updateId = new UpdateId();
        commandColl.put(add,add.function());
    }
}
