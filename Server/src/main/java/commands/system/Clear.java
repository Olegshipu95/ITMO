//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package commands.system;

import collections.StackCollection;
import commands.*;

import java.net.DatagramSocket;
import java.net.InetAddress;
import static commands.CommandArgs.NO_ARGS;

public class Clear extends CommandsToCollection {
    public Clear() {
        super("clear", NO_ARGS, "clear the collection");
    }

    public ServerResult function(String ... args) {

        try {
            StackCollection.entitiesCollection.clear();
            return new ServerResult(true);
        } catch (Exception var2) {
            return new ServerResult(false);
        }
    }
}
