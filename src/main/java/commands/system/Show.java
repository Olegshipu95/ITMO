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
            for (int i = (StackCollection.cloneCollection(clone)).size(); i>0; i--) {
                System.out.println(clone.pop().toString());
            }
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
