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
}
