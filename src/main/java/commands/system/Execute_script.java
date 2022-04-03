package commands.system;

import commands.AbstractCommand;

public class Execute_script extends AbstractCommand {
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
