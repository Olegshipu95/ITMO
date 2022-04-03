package commands.system;

import collections.StackCollection;
import commands.AbstractCommand;
import entities.HumanBeing;

import java.util.Scanner;
import java.util.Stack;

public class RemoveLower extends AbstractCommand {//Сделана полностью
    @Override
    public boolean function() {
        try {
            System.out.println("Введите id");
            Scanner scanner = new Scanner(System.in);
            int id;
            while (true) {
                try {
                    id = scanner.nextInt();
                    break;
                } catch (Exception e) {
                    System.out.println("Введены некорректные данные");
                }
            }
            Stack<HumanBeing> clone = new Stack<>();
            HumanBeing lol;
            while (StackCollection.entitiesCollection.size()>0) {
                if((lol = StackCollection.entitiesCollection.pop()).getId()>=id) clone.push(lol);
            }
            StackCollection.entitiesCollection = clone;
            return true;
        } catch (
                Exception e) {
            return false;
        }
    }
}
