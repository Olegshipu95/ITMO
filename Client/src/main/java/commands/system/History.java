//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package commands.system;

import collections.HistoryCollection;
import commands.AbstractCommand;

public class History extends AbstractCommand {
    public History() {
        super("history", false, "output the last 14 commands (without their arguments)");
    }

    public boolean function(String ... args) {
        if(!checkTypeArgs(args)){
            System.out.println("This command is using without args so I'll run the program without them");
        }
        try {
            System.out.println(HistoryCollection.historyCollectrion);
            return true;
        } catch (Exception var2) {
            return false;
        }
    }


}
