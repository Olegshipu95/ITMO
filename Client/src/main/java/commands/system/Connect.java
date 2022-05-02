package commands.system;

import commands.AbstractCommand;

public class Connect extends AbstractCommand {
    public Connect() {
        super("connect", true, "This command is using for connecting with server");
    }

    @Override
    public boolean function(String... args) {
        if(!checkTypeArgs(args)){
            System.out.println("This command is using with args. You need write id and host like: localhost,5520");
        }
        return false;
    }
}
