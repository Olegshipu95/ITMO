//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package commands.system;

import commands.AbstractCommand;

public class Exit extends AbstractCommand {
    public Exit() {
        super("exit", false, "terminate the program (without saving to a file)");
    }

    public boolean function(String ... args) {
        if(!checkTypeArgs(args)){
            System.out.println("This command is using without args so I'll run the program without them");
        }
        try {
            System.exit(1);
            return true;
        } catch (Exception var2) {
            return false;
        }
    }

}
