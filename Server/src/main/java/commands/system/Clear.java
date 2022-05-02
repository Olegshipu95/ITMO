//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package commands.system;

import collections.StackCollection;
import commands.AbstractCommand;

public class Clear extends AbstractCommand {
    public Clear() {
        super("clear", false, "clear the collection");
    }

    public boolean function(String ... args) {
        if(!checkTypeArgs(args)){
            System.out.println("This command is using without args so I'll run the program without them");
        }
        try {
            StackCollection.entitiesCollection.clear();
            return true;
        } catch (Exception var2) {
            return false;
        }
    }
}
