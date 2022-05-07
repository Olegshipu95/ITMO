//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package commands.system;

import collections.StackCollection;
import commands.*;

import java.net.DatagramSocket;
import java.net.InetAddress;

public class RemoveAt extends CommandsToCollection {
    public RemoveAt() {
        super("remove_at", CommandArgs.ID_ARGS, "delete an item located in the specified position of the collection (index)");
    }

    public ServerResult function(String... arguments) {
        try {
            int id = Integer.parseInt(arguments[0]);
            StackCollection.entitiesCollection.remove(id);
            return new ServerResult(true);
        } catch (Exception var5) {
            return new ServerResult(false);
        }
    }
}
