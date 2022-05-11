//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package commands.system;

import Exceptions.StupidUserException;
import collections.IdCollection;
import collections.StackCollection;
import commands.AbstractCommand;
import commands.CheckTheCorrect;
import commands.WriteTheValues;
import entities.HumanBeing;

import java.util.Arrays;
import java.util.Stack;

public class UpdateId extends AbstractCommand {
    public boolean function() {
        System.out.println("This command only works with arguments");
        return true;
    }

    public boolean function(String[] arguments) {
        try {
            if (StackCollection.entitiesCollection.isEmpty()) {
                System.out.println("Collection has no items");
                return true;
            } else {
                String[] local = arguments;
                if (arguments.length > 11) {
                    arguments = new String[11];
                    arguments = (String[])Arrays.copyOfRange(local, 0, 11);
                }

                int id;
                if (arguments.length < 11) {
                    arguments = new String[11];
                    Arrays.fill(arguments, "");

                    for(id = 0; id < local.length; ++id) {
                        arguments[id] = local[id];
                    }
                }

                id = -1;
                boolean var4 = false;

                try {
                    id = Integer.parseInt(arguments[0]);
                    if (!IdCollection.idCollection.contains(id)) {
                        throw new NumberFormatException();
                    }

                    var4 = true;
                } catch (NumberFormatException var7) {
                    System.out.println("Incorrect data entered");

                    while(true) {
                        System.out.println("Enter the id value again");
                        id = CheckTheCorrect.checkTheCorrect(id);
                        if (IdCollection.idCollection.contains(id)) {
                            break;
                        }

                        System.out.println("There is no such id");
                    }
                }

                Stack clone = new Stack();

                while(StackCollection.entitiesCollection.size() > 0) {
                    HumanBeing lol;
                    if ((lol = (HumanBeing)StackCollection.entitiesCollection.pop()).getId() != id) {
                        clone.push(lol);
                    }
                }

                StackCollection.entitiesCollection = clone;
                WriteTheValues.createObject(arguments, id);
                return true;
            }
        } catch (StupidUserException var8) {
            System.exit(1);
            return true;
        }
    }
}
