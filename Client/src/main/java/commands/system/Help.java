//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

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
        Iterator var1 = CommandCollection.clientCommands.entrySet().iterator();
        System.out.println("|.............Client's commands.............|");
        while (var1.hasNext()) {
            Entry<String, String> pair = (Entry) var1.next();
            String key = (String) pair.getKey();
            String value = (String) pair.getValue();
            System.out.println("|| " + key + " --> " + value);
        }
        if (!CommandCollection.serverCommands.isEmpty()) {
            Iterator<Entry<String, CommandData>> var2 = CommandCollection.serverCommands.entrySet().iterator();
            System.out.println("|.............Server's commands.............|");
            while (var2.hasNext()) {
                Entry<String, CommandData> pair = var2.next();
                String key = pair.getKey();
                CommandData value = pair.getValue();
                System.out.println("|| " + key + " --> " + value.getDescription());
            }
        }
        return new Result(true);
    }
}
