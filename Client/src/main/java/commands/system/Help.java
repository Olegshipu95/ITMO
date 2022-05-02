//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package commands.system;

import collections.CommandCollection;
import commands.AbstractCommand;

import java.util.Iterator;
import java.util.Map.Entry;

public class Help extends AbstractCommand {
    public Help() {
        super("help", false, "output help for available commands");
    }

    public boolean function(String ... args) {
        if(!checkTypeArgs(args)){
            System.out.println("This command is using without args so I'll run the program without them");
        }
        try {
            Iterator var1 = CommandCollection.commandInfo.entrySet().iterator();

            while(var1.hasNext()) {
                Entry<String, String> pair = (Entry)var1.next();
                String key = (String)pair.getKey();
                String value = (String)pair.getValue();
                System.out.println("|| "+key + " --> " + value);
            }

            return true;
        } catch (Exception var5) {
            return false;
        }
    }
}
