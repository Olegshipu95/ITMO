package commands.system;

import commands.AbstractCommand;

public class AverageOfMinutesOfWaiting extends AbstractCommand {
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
