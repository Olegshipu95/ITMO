//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package commands.system;

import collections.JavaIO;
import collections.StackCollection;
import commands.AbstractCommand;
import entities.HumanBeing;

import java.util.Iterator;

public class Save extends AbstractCommand {
    public Save() {
        super("save", false, "save the collection to a file");

    }

    public boolean function(String ... arguments) {
        if(!checkTypeArgs(arguments)){
            System.out.println("This command is using without args so I'll run the program without them");

        }
        try {
            Iterator var1 = StackCollection.entitiesCollection.iterator();

            while(var1.hasNext()) {
                HumanBeing obj = (HumanBeing)var1.next();
                JavaIO.writeToFile(obj.csvToString() + "\n");
            }

            return true;
        }
        catch (Exception var3) {
            return false;
        }
    }


}
