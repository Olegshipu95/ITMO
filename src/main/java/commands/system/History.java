package commands.system;

import collections.HistoryCollection;
import commands.AbstractCommand;

public class History extends AbstractCommand {//Сделана полностью
    @Override
    public boolean function() {

        try {
            System.out.println(HistoryCollection.historyCollectrion);
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
