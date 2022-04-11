package commands.system;

import collections.InfoFail;
import collections.StackCollection;
import commands.AbstractCommand;

public class Info extends AbstractCommand {
    @Override
    public boolean function() {
        try{
            System.out.println(InfoFail.infoCol(StackCollection.entitiesCollection.size()));
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
