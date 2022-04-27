//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package commands.system;

import collections.IdCollection;
import collections.StackCollection;
import commands.AbstractCommand;
import commands.CheckTheCorrect;
import entities.HumanBeing;

import java.util.Stack;

public class RemoveById extends AbstractCommand {
    public boolean function() {
        System.out.println("Эта команда без аргументов");
        return false;
    }

    public boolean function(String[] arguments) {
        try {
            int id = -1;
            boolean var3 = false;

            try {
                id = Integer.parseInt(arguments[0]);
                var3 = true;
            } catch (NumberFormatException var6) {
                System.out.println("Incorrect data entered from file");

                do {
                    System.out.println("Введите значение id повторно");
                    id = CheckTheCorrect.checkTheCorrect(id);
                } while(!IdCollection.idCollection.contains(id));
            }

            Stack clone = new Stack();

            while(StackCollection.entitiesCollection.size() > 0) {
                HumanBeing lol;
                if (id != (lol = (HumanBeing)StackCollection.entitiesCollection.pop()).getId()) {
                    clone.push(lol);
                }
            }

            StackCollection.entitiesCollection = clone;
            return true;
        } catch (Exception var7) {
            return false;
        }
    }
}
