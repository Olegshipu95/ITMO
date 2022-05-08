
package commands.system;

import collections.CommandCollection;
import commands.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Help extends CommandsToCollection {
    public Help() {
        super("help", CommandArgs.NO_ARGS, "output help for available commands");
    }

    public Result function(String... args) {
        Iterator iterator = CommandCollection.clientCommands.entrySet().iterator();
        System.out.println("|.............Client's commands.............|");
        while (iterator.hasNext()) {
            Entry<String, String> pair = (Entry) iterator.next();
            String key = (String) pair.getKey();
            String value = (String) pair.getValue();
            System.out.println("|| " + key + " --> " + value);
        }
        if (!CommandCollection.serverCommands.isEmpty()) {
            Iterator<Entry<String, CommandData>> iterator2 = CommandCollection.serverCommands.entrySet().iterator();
            System.out.println("|.............Server's commands.............|");
            while (iterator2.hasNext()) {
                Entry<String, CommandData> pair = iterator2.next();
                String key = pair.getKey();
                CommandData value = pair.getValue();
                System.out.println("|| " + key + " --> " + value.getDescription());
            }
        }
        return new Result(true);
    }
}
