//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package commands.system;

import collections.StackCollection;
import commands.AbstractCommand;
import entities.HumanBeing;

import java.util.Comparator;
import java.util.Iterator;

public class PrintAscending extends AbstractCommand {
    public PrintAscending() {
    }

    public boolean function() {
        try {
            StackCollection.entitiesCollection.sort(new Comparator<HumanBeing>() {
                public int compare(HumanBeing o1, HumanBeing o2) {
                    return o1.getId() - o2.getId();
                }
            });
            Iterator var1 = StackCollection.entitiesCollection.iterator();

            while(var1.hasNext()) {
                HumanBeing obj = (HumanBeing)var1.next();
                System.out.println(obj.getId());
            }

            return true;
        } catch (Exception var3) {
            return false;
        }
    }

    public boolean function(String[] arguments) {
        System.out.println("This command has no arguments, please retype");
        return false;
    }
}
