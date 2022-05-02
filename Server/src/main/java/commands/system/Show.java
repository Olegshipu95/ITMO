//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package commands.system;

import collections.StackCollection;
import commands.AbstractCommand;
import entities.HumanBeing;

import java.util.Stack;

public class Show extends AbstractCommand {
    public Show() {
        super("show", false, "output to the standard output stream all the elements of the collection in a string representation");
    }

    public boolean function(String ... arguments) {
        if(!checkTypeArgs(arguments)){
            System.out.println("This command is using without args so I'll run the program without them");

        }
        try {
            Stack clone = new Stack();

            while(StackCollection.entitiesCollection.size() > 0) {
                HumanBeing local = (HumanBeing)StackCollection.entitiesCollection.pop();
                System.out.println(local.toString());
                clone.push(local);
            }

            StackCollection.entitiesCollection = clone;
            return true;
        } catch (Exception var3) {
            return false;
        }
    }

}
