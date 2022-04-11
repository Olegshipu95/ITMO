package commands.system;

import collections.IdCollection;
import collections.StackCollection;
import commands.AbstractCommand;
import commands.WriteTheValues;
import entities.HumanBeing;

import java.util.Scanner;
import java.util.Stack;

public class UpdateId extends AbstractCommand {//Сделана полностью
    @Override
    public boolean function() {
        System.out.println("Эта команда работает только с арггументами");
        return false;
    }

    @Override
    public boolean function(String[] arguments) {
        if(arguments.length!=11){
            System.out.println("Неправильное количество аргументов");
            return false;
        }
        try {
            int id = -1;
            boolean check = false;
            try {
                id = Integer.parseInt(arguments[0]);
                check = true;
            } catch (NumberFormatException e) {
                System.out.println("Введены некорректные данные из файла");
                while (true) {
                    id = WriteTheValues.checkTheCorrect(id, "Введите значение id повторно");
                    if (IdCollection.idCollection.contains(id)) {
                        break;
                    }
                }
            }
            Stack<HumanBeing> clone = new Stack<>();
            HumanBeing lol;
            while (StackCollection.entitiesCollection.size() > 0) {
                if ((lol = StackCollection.entitiesCollection.pop()).getId() != id) clone.push(lol);
            }
            StackCollection.entitiesCollection = clone;
            commands.WriteTheValues.createObject(arguments,id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
