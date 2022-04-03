package commands.system;

import collections.StackCollection;
import commands.AbstractCommand;
import entities.HumanBeing;

import java.util.Stack;

public class Clear extends AbstractCommand {//Сделана полностью
    @Override
    public boolean function() {
        try {
            Stack<HumanBeing> local = new Stack<>();
            StackCollection.entitiesCollection = local;
            return true;
        }
        catch (Exception e){
            return false;
        }
    }
}
