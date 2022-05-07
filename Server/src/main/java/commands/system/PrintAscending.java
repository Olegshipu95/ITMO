//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package commands.system;

import collections.StackCollection;
import commands.*;
import entities.HumanBeing;

import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class PrintAscending extends CommandsToCollection {
    public PrintAscending() {
        super("printAscending", CommandArgs.NO_ARGS, "output the elements of the collection in ascending order");
    }

    public ServerResult function(String ... args) {
        ArrayList<String> arrayList = new ArrayList<>();
        try {

            StackCollection.entitiesCollection.sort(new Comparator<HumanBeing>() {
                public int compare(HumanBeing o1, HumanBeing o2) {
                    return o1.getId() - o2.getId();
                }
            });
            Iterator var1 = StackCollection.entitiesCollection.iterator();

            while(var1.hasNext()) {
                HumanBeing obj = (HumanBeing)var1.next();
                arrayList.add(obj.toString());
            }
            arrayList.add("Command successfully executed");
            return new ServerResult(arrayList,true);
        } catch (Exception var3) {
            return new ServerResult(false);
        }
    }

}
