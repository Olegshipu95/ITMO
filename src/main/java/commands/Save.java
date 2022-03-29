package commands;

import collections.JavaIO;
import collections.StackCollection;
import entities.HumanBeing;

public class Save extends AbstractCommand{
    @Override
    public boolean function() {
        for(HumanBeing obj: StackCollection.entitiesCollection){
            JavaIO.writeToFile(obj.toString());
        }
        return true;
    }
}
