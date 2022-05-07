//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package commands.system;

import collections.JavaIO;
import collections.StackCollection;
import commands.*;
import entities.HumanBeing;

import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Iterator;

public class Save extends CommandsToCollection {
    public Save() {
        super("save", CommandArgs.NO_ARGS, "save the collection to a file");

    }

    public ServerResult function(String ... arguments) {

        try {
            Iterator var1 = StackCollection.entitiesCollection.iterator();

            while(var1.hasNext()) {
                HumanBeing obj = (HumanBeing)var1.next();
                JavaIO.writeToFile(obj.csvToString() + "\n");
            }
            ArrayList<String> arrayList = new ArrayList<>();
            arrayList.add("Success save in file");
            return new ServerResult(arrayList,true);
        }
        catch (Exception var3) {
            return new ServerResult(false);
        }
    }


}
