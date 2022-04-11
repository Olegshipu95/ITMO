package commands.system;

import collections.CommandCollection;
import commands.AbstractCommand;
import lombok.var;

import java.util.Map;
import java.util.Set;
import java.util.HashMap;

import static collections.CommandCollection.commandColl;

public class Help extends AbstractCommand {//Сделана полностью
    @Override
    public boolean function() {
        try {
            for(Map.Entry<String, String> pair: CommandCollection.commandInfo.entrySet())
            {
                String key = pair.getKey();
                String value = pair.getValue();
                System.out.println(key + " --> " + value);
            }
            return true;
        }
        catch (Exception e){
            return false;
        }
    }
    @Override
    public boolean function(String[] arguments) {
        System.out.println("Эта команда без аргументов, повторите ввод");
        return false;
    }
}
