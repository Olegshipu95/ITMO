//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package commands.system;

import collections.InfoFail;
import collections.StackCollection;
import commands.AbstractCommand;

public class Info extends AbstractCommand {

    public boolean function() {
        try {
            System.out.println(InfoFail.infoCol(StackCollection.entitiesCollection.size()));
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
