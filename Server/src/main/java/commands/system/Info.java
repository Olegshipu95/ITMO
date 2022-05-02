//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package commands.system;

import collections.InfoFail;
import collections.StackCollection;
import commands.AbstractCommand;

public class Info extends AbstractCommand {
    public Info() {
        super("info", false, "output information about the collection (type, initialization date, number of items, etc.) to the standard output stream.");
    }

    public boolean function(String ... args) {
        if(!checkTypeArgs(args)){
            System.out.println("This command is using without args so I'll run the program without them");
        }
        try {
            System.out.println(InfoFail.infoCol(StackCollection.entitiesCollection.size()));
            return true;
        } catch (Exception var2) {
            return false;
        }
    }


}
