//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package commands.system;

import commands.AbstractCommand;
import commands.CommandArgs;
import commands.CommandsToCollection;
import commands.Result;

public class Exit extends CommandsToCollection {
    public Exit() {
        super("exit", CommandArgs.NO_ARGS, "terminate the program (without saving to a file)");
    }

    public Result function(String ... args) {
            System.exit(0);
            return null;
    }

}
