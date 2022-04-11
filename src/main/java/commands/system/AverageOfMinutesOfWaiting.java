package commands.system;

import collections.StackCollection;
import commands.AbstractCommand;
import entities.HumanBeing;

import java.util.Stack;

public class AverageOfMinutesOfWaiting extends AbstractCommand {//Готова полностью
    @Override
    public boolean function() {
        try {
            Long sum = 0L;
            int longArray = StackCollection.entitiesCollection.size();
            Stack<HumanBeing> clone = new Stack<>();
            HumanBeing lol;
            while (StackCollection.entitiesCollection.size()>0){
                sum += StackCollection.entitiesCollection.peek().getMinutesOfWaiting();
                clone.push(StackCollection.entitiesCollection.pop());
            }
            StackCollection.entitiesCollection = clone;
            System.out.println("Вывод среднего значения поля minutesOfWaiting для всех элементов коллекции равен " + (sum/longArray));
            return true;
        }
        catch (Exception e){
            return false;
        }
    }
    @Override
    public boolean function(String[] arguments) {
        System.out.println("Эта команда без аргументов2");
        return false;
    }
}
