package commands.system;

import commands.AbstractCommand;

public class Exit extends AbstractCommand {
    @Override
    public boolean function() {//Сделана полностью
        try {
            System.exit(1);
            return true;
        }
        catch (Exception e){
            return false;
        }
    }
}
