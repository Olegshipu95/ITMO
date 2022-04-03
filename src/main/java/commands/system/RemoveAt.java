package commands.system;

import collections.StackCollection;
import commands.AbstractCommand;
import entities.HumanBeing;

import java.util.Scanner;
import java.util.Stack;

public class RemoveAt extends AbstractCommand {//Сделана полностью
    @Override
    public boolean function() {
        try{
            Scanner scanner = new Scanner(System.in);
            int id;
            while (true) {
                try {
                    System.out.println("Введите id");
                    id = scanner.nextInt();
                    break;
                } catch (Exception e) {
                    System.out.println("Введены некорректные данные");
                }
            }
            StackCollection.entitiesCollection.remove(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
