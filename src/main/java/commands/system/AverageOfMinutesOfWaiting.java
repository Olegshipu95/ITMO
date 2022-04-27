//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package commands.system;

import collections.StackCollection;
import commands.AbstractCommand;
import entities.HumanBeing;

import java.util.Stack;

public class AverageOfMinutesOfWaiting extends AbstractCommand {
    public boolean function() {
        try {
            Long sum = 0L;
            int longArray = StackCollection.entitiesCollection.size();
            Stack clone = new Stack();

            while(StackCollection.entitiesCollection.size() > 0) {
                sum = sum + (long)((HumanBeing)StackCollection.entitiesCollection.peek()).getMinutesOfWaiting();
                clone.push((HumanBeing)StackCollection.entitiesCollection.pop());
            }

            StackCollection.entitiesCollection = clone;
            System.out.println("The output of the average value of the minutesOfWaiting field for all elements of the collection is " + sum / (long)longArray);
            return true;
        } catch (Exception var5) {
            return false;
        }
    }

    public boolean function(String[] arguments) {
        System.out.println("This command without arguments");
        return false;
    }
}
