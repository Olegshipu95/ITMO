//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package commands.system;

import collections.ExecuteFileCollection;
import collections.JavaIO;
import commands.AbstractCommand;

public class Execute_script extends AbstractCommand {
    public Execute_script() {
    }

    public boolean function() {
        System.out.println("This command is used with arguments.");
        return false;
    }

    public boolean function(String[] arguments) {
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
