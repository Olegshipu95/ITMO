package collections;
import java.util.HashMap;

import commands.AbstractCommand;
import commands.system.*;
//import lombok.var;

public class CommandCollection {
    public static HashMap<String, AbstractCommand> commandColl = new HashMap<>();
    public static HashMap<String, String> commandInfo = new HashMap<>();

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

    static {
        commandInfo.put("add","add a new item to the collection");
        commandInfo.put("averageOfMinutes", "output the average value of the minutes Of Waiting field for all items in the collection");
        commandInfo.put("clear","clear the collection");
        commandInfo.put("execute_script","read and execute the script from the specified file. The script contains commands in the same form in which they are entered by the user in interactive mode.");
        commandInfo.put("exit","terminate the program (without saving to a file)");
        commandInfo.put("help","output help for available commands");
        commandInfo.put("history","output the last 14 commands (without their arguments)");
        commandInfo.put("info","output information about the collection (type, initialization date, number of items, etc.) to the standard output stream.");
        commandInfo.put("printAscending","output the elements of the collection in ascending order");
        commandInfo.put("remove_by_id","delete an item from the collection by its id");
        commandInfo.put("remove_at","delete an item located in the specified position of the collection (index)");
        commandInfo.put("remove_lower","remove all items smaller than the specified one from the collection");
        commandInfo.put("save","save the collection to a file");
        commandInfo.put("show","output to the standard output stream all the elements of the collection in a string representation");
        commandInfo.put("sumOfMinutesOfWaiting","print the sum of the values of the minutes Of Waiting field for all elements of the collection");
        commandInfo.put("updateId","update the value of a collection item whose id is equal to the specified one");
    }
}
