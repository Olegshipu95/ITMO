//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package commands.system;

import collections.StackCollection;
import commands.AbstractCommand;
import entities.HumanBeing;

import java.util.Stack;

public class SumOfMinutesOfWaiting extends AbstractCommand {
    public SumOfMinutesOfWaiting() {
    }

    public boolean function() {
        try {
            Long sum = 0L;
            Stack clone = new Stack();

            while(StackCollection.entitiesCollection.size() > 0) {
                sum = sum + (long)((HumanBeing)StackCollection.entitiesCollection.peek()).getMinutesOfWaiting();
                clone.push((HumanBeing)StackCollection.entitiesCollection.pop());
            }

            StackCollection.entitiesCollection = clone;
            System.out.println("The sum of the minutesOfWaiting field values \u200B\u200Bfor all elements of the collection is" + sum);
            return true;
        } catch (Exception var4) {
            return false;
        }
    }

    public boolean function(String[] arguments) {
        return false;
    }
}
