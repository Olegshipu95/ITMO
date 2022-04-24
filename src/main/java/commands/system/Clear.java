//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package commands.system;

import collections.StackCollection;
import commands.AbstractCommand;

public class Clear extends AbstractCommand {
    public Clear() {
    }

    public boolean function() {
        try {
            StackCollection.entitiesCollection.clear();
            return true;
        } catch (Exception var2) {
            return false;
        }
    }

    public boolean function(String[] arguments) {
        System.out.println("This command without arguments");
        return false;
    }
}
