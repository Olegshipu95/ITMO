//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package commands.system;

import collections.StackCollection;
import commands.AbstractCommand;
import commands.CheckTheCorrect;

public class RemoveAt extends AbstractCommand {
    public boolean function() {
        System.out.println("This command is not used without arguments");
        return false;
    }

    public boolean function(String[] arguments) {
        try {

            int id = -1;
            try {
                id = Integer.parseInt(arguments[0]);
            } catch (NumberFormatException var4) {
                System.out.println("Incorrect data entered from file");
                System.out.println("Enter the id value again");
                id = CheckTheCorrect.checkTheCorrect(id);
            }

            StackCollection.entitiesCollection.remove(id);
            return true;
        } catch (Exception var5) {
            return false;
        }
    }
}
