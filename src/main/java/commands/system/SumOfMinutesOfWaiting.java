package commands.system;

import commands.AbstractCommand;

public class SumOfMinutesOfWaiting extends AbstractCommand {
    @Override
    public boolean function() {
        try {
            return true;
        }
        catch (Exception e){
            return false;
        }
    }
}
