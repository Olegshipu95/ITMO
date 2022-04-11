package commands.system;

import collections.StackCollection;
import commands.AbstractCommand;
import entities.HumanBeing;

import java.util.Stack;

public class SumOfMinutesOfWaiting extends AbstractCommand {//Готова полностью
    @Override
    public boolean function() {
        try {
            Long sum = 0L;
            Stack<HumanBeing> clone = new Stack<>();
            HumanBeing lol;
            while (StackCollection.entitiesCollection.size()>0){
                sum += StackCollection.entitiesCollection.peek().getMinutesOfWaiting();
                clone.push(StackCollection.entitiesCollection.pop());
            }
            StackCollection.entitiesCollection = clone;
            System.out.println("Сумма значений поля minutesOfWaiting для всех элементов коллекции равна " + sum);
            return true;
        }
        catch (Exception e){
            return false;
        }
    }

    @Override
    public boolean function(String[] arguments) {
        return false;
    }
}
