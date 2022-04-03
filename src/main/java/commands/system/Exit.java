package commands.system;

import commands.AbstractCommand;

public class Exit extends AbstractCommand {//Сделана полностью
    @Override
    public boolean function() {
        try {
            System.exit(1);
            return true;
        }
        catch (Exception e){
            return false;
        }
    }
}
