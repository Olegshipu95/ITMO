package commands.system;

import collections.StackCollection;
import commands.AbstractCommand;
import entities.HumanBeing;

import java.util.Stack;

public class Clear extends AbstractCommand {//Сделана полностью
    @Override
    public boolean function() {
        try {
            StackCollection.entitiesCollection.clear();
            return true;
        }
        catch (Exception e){
            return false;
        }
    }
    @Override
    public boolean function(String[] arguments) {
        System.out.println("Эта команда без аргументов");
        return false;
    }
}
