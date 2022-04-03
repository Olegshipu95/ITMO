package commands.system;

import collections.CommandCollection;
import commands.AbstractCommand;

import java.util.Set;

import static collections.CommandCollection.commandColl;

public class Help extends AbstractCommand {//Сделана полностью
    @Override
    public boolean function() {
        try {
            Set<String> keys = commandColl.keySet();
            System.out.println("Команды: ");
            return true;
        }
        catch (Exception e){
            return false;
        }
    }
}
