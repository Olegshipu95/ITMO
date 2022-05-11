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
    public boolean function() {
        try {
            Iterator var1 = CommandCollection.commandInfo.entrySet().iterator();

            while(var1.hasNext()) {
                Entry<String, String> pair = (Entry)var1.next();
                String key = (String)pair.getKey();
                String value = (String)pair.getValue();
                System.out.println(key + " --> " + value);
            }

            return true;
        } catch (Exception var5) {
            return false;
        }
    }

    public boolean function(String[] arguments) {
        System.out.println("This command has no arguments, please retype");
        return false;
    }
}
