//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package commands.system;

import collections.HistoryCollection;
import commands.AbstractCommand;

public class History extends AbstractCommand {
    public boolean function() {
        try {
            System.out.println(HistoryCollection.historyCollectrion);
            return true;
        } catch (Exception var2) {
            return false;
        }
    }

    public boolean function(String[] arguments) {
        System.out.println("This command has no arguments, please retype");
        return false;
    }
}
