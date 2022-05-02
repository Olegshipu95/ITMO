//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package commands.system;

import collections.ExecuteFileCollection;
import collections.JavaIO;
import commands.AbstractCommand;

public class ExecuteScript extends AbstractCommand {
    public ExecuteScript() {
        super("execute_script", true, "read and execute the script from the specified file. The script contains commands in the same form in which they are entered by the user in interactive mode.");
    }

    public boolean function(String ... arguments) {
        if(!checkTypeArgs(arguments)){
            System.out.println("This command is using with args");
            return true;
        }
        String filepath = arguments[0];

        try {
            if (ExecuteFileCollection.executeFileCollection.contains(filepath)) {
                System.out.println("This address has already been used, please use another one");
                return false;
            } else {
                ExecuteFileCollection.executeFileCollection.add(filepath);
                if (JavaIO.readScript(filepath)) {
                    System.out.println("Everything went well");
                    return true;
                } else {
                    System.out.println("An error occurred during the script");
                    return false;
                }
            }
        } catch (Exception var4) {
            System.out.println("An error has occurred.");
            return false;
        }
    }
}
