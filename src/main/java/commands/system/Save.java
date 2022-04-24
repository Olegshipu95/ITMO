//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package commands.system;

import collections.JavaIO;
import collections.StackCollection;
import commands.AbstractCommand;
import entities.HumanBeing;

import java.util.Iterator;

public class Save extends AbstractCommand {
    public Save() {
    }

    public boolean function() {
        try {
            Iterator var1 = StackCollection.entitiesCollection.iterator();

            while(var1.hasNext()) {
                HumanBeing obj = (HumanBeing)var1.next();
                JavaIO.writeToFile(obj.csvToString() + "\n");
            }

            return true;
        } catch (Exception var3) {
            return false;
        }
    }

    public boolean function(String[] arguments) {
        return false;
    }
}
