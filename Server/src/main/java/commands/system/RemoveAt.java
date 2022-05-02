//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package commands.system;

import collections.StackCollection;
import commands.AbstractCommand;
import commands.CheckTheCorrect;

public class RemoveAt extends AbstractCommand {
    public RemoveAt() {
        super("remove_at", true, "delete an item located in the specified position of the collection (index)");
    }

    public boolean function(String ... arguments) {
        if(arguments.length > 1) {
            System.out.println("You should write only id in this command, so take only your 1st entered value");
        }
        if(arguments.length == 0){arguments = new String[]{""};
        }
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
