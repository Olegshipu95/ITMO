//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package commands.system;

import collections.InfoFail;
import collections.StackCollection;
import commands.*;

import java.net.DatagramSocket;
import java.net.InetAddress;

public class Info extends CommandsToCollection {
    public Info() {
        super("info", CommandArgs.NO_ARGS, "output information about the collection (type, initialization date, number of items, etc.) to the standard output stream.");
    }

    public ServerResult function(String ... args) {
        try {
            System.out.println(InfoFail.infoCol(StackCollection.entitiesCollection.size()));
            return new ServerResult(true);
        } catch (Exception var2) {
            return new ServerResult(false);
        }
    }


}
