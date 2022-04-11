package commands.system;

import collections.StackCollection;
import commands.AbstractCommand;
import entities.HumanBeing;

import java.util.Comparator;

public class PrintAscending extends AbstractCommand {//ВРоде сделан полностью
    @Override
    public boolean function() {
        try {
            StackCollection.entitiesCollection.sort(new Comparator<HumanBeing>() {
                @Override
                public int compare(HumanBeing o1, HumanBeing o2) {
                    return o1.getId()- o2.getId();
                }
            });
            for (HumanBeing obj:StackCollection.entitiesCollection) {
                System.out.println(obj.getId());
            }
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
