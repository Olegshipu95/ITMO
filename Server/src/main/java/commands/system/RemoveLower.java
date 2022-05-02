//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package commands.system;

import collections.IdCollection;
import collections.StackCollection;
import commands.AbstractCommand;
import commands.CheckTheCorrect;
import entities.HumanBeing;

import java.util.Stack;

public class RemoveLower extends AbstractCommand {
    public RemoveLower() {
        super("remove_lower", true, "remove all items smaller than the specified one from the collection");
    }


    public boolean function(String...arguments) {
        try {
            int id = -1;
            boolean var3 = false;
            if(arguments.length > 1) {
                System.out.println("You should write only id in this command, so take only your 1st entered value");
            }
            if(arguments.length == 0){arguments = new String[]{""};
            }
            try {
                id = Integer.parseInt(arguments[0]);
                var3 = true;
            } catch (NumberFormatException var6) {
                System.out.println("Incorrect data entered from file");

                do {
                    System.out.println("Enter the id value again");
                    id = CheckTheCorrect.checkTheCorrect(id);
                } while(!IdCollection.idCollection.contains(id));
            }

            Stack clone = new Stack();

            while(StackCollection.entitiesCollection.size() > 0) {
                HumanBeing lol;
                if ((lol = (HumanBeing)StackCollection.entitiesCollection.pop()).getId() >= id) {
                    clone.push(lol);
                }
            }

            StackCollection.entitiesCollection = clone;
            return true;
        } catch (Exception var7) {
            return false;
        }
    }
}
