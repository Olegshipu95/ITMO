package commands.system;

import collections.JavaIO;
import collections.StackCollection;
import commands.AbstractCommand;
import entities.HumanBeing;

public class Save extends AbstractCommand {
    @Override
    public boolean function() {//Сделана полностью
        try {
            for (HumanBeing obj : StackCollection.entitiesCollection) {
                JavaIO.writeToFile(obj.csvToString());
            }
            return true;
        }
        catch(Exception e){
            return false;
        }
    }

    @Override
    public boolean function(String[] arguments) {
        return false;
    }
}
