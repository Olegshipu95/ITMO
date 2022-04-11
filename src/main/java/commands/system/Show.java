package commands.system;

import collections.StackCollection;
import commands.AbstractCommand;
import entities.HumanBeing;

import java.util.Stack;

public class Show extends AbstractCommand {//Сделана полностью
    @Override
    public boolean function() {
        try {
            Stack<HumanBeing> clone = new Stack<HumanBeing>();
            while (StackCollection.entitiesCollection.size()>0){
                HumanBeing local = StackCollection.entitiesCollection.pop();
                System.out.println(local.toString());
                clone.push(local);
            }
            StackCollection.entitiesCollection = clone;
            return true;
        }
        catch (Exception e){
            return false;
        }
    }

    @Override
    public boolean function(String[] arguments) {
        return false;
    }
}
