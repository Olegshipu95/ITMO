package commands.system;

import collections.IdCollection;
import collections.StackCollection;
import commands.AbstractCommand;
import entities.HumanBeing;

import java.util.Scanner;
import java.util.Stack;

public class UpdateId extends AbstractCommand {//Сделана полностью
    @Override
    public boolean function() {
        try {
            Scanner scanner = new Scanner(System.in);
            int id;
            while (true) {
                try {
                    System.out.println("Введите id");
                    id = scanner.nextInt();
                    if (IdCollection.idCollection.contains(id)) {
                        break;
                    } else throw new Exceptions.NoInCollection();
                } catch (Exceptions.NoInCollection e) {
                    System.out.println("Объекта с этим id не существует");
                } catch (Exception e) {
                    System.out.println("Введены некорректные данные");

                }
            }
            Stack<HumanBeing> clone = new Stack<>();
            HumanBeing lol;
            while (StackCollection.entitiesCollection.size() > 0) {
                if ((lol = StackCollection.entitiesCollection.pop()).getId() != id) clone.push(lol);
            }
            StackCollection.entitiesCollection = clone;
            commands.WriteTheValues.createObject(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
