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
    @Override
    public boolean function(String[] arguments) {
        System.out.println("Эта команда без аргументов");
        return false;
    }
}
