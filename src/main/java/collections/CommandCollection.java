package collections;
import java.util.Collections;
import java.util.HashSet;
import commands.*;
//import lombok.var;

public class CommandCollection {
    public static HashSet<AbstractCommand> commandColl = new HashSet<>();
    public static void commandManager() {
        Add add = new Add();
        AverageOfMinutesOfWaiting averageOfMinutesOfWaiting = new AverageOfMinutesOfWaiting();
        Clear clear = new Clear();
        Execute_script execute_script = new Execute_script();
        Exit exit = new Exit();
        Help help = new Help();
        History history = new History();
        Info info = new Info();
        PrintAscending printAscending = new PrintAscending();
        Remove_by_id remove_by_id = new Remove_by_id();
        RemoveAt remove_at = new RemoveAt();
        RemoveLower remove_lower = new RemoveLower();
        Save save = new Save();
        Show show = new Show();
        SumOfMinutesOfWaiting sumOfMinutesOfWaiting = new SumOfMinutesOfWaiting();
        UpdateId updateId = new UpdateId();
        Collections.addAll(commandColl, add, averageOfMinutesOfWaiting, clear,
                execute_script, exit, help, history, info, printAscending, remove_by_id, remove_at, remove_lower,
                save, show, sumOfMinutesOfWaiting, updateId);
    }
}
