//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package commands.system;

import commands.AbstractCommand;

public class Exit extends AbstractCommand {
    public boolean function() {
        try {
            System.exit(1);
            return true;
        } catch (Exception var2) {
            return false;
        }
    }

    public boolean function(String[] arguments) {
        System.out.println("This command without arguments");
        return false;
    }
}
