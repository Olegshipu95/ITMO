//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package commands.system;

import Exceptions.StupidUserException;
import commands.AbstractCommand;
import commands.WriteTheValues;

import java.util.Arrays;

public class Add extends AbstractCommand {
    public boolean function() {
        try {
            String[] local = new String[10];
            Arrays.fill(local, "");
            return this.function(local);
        } catch (Exception var2) {
            return false;
        }
    }

    public boolean function(String[] arguments) {
        try {
            String[] local = arguments;
            if (arguments.length > 10) {
                arguments = new String[10];
                arguments = (String[])Arrays.copyOfRange(local, 0, arguments.length);
            }

            if (arguments.length < 10) {
                arguments = new String[10];
                Arrays.fill(arguments, "");

                for(int i = 0; i < local.length; ++i) {
                    arguments[i] = local[i];
                }
            }

            WriteTheValues.createObject(arguments);
            return true;
        } catch (StupidUserException var4) {
            System.exit(1);
            return true;
        } catch (Exception var5) {
            return false;
        }
    }
}
