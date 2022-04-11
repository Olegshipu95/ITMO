package commands.system;

import collections.StackCollection;
import commands.AbstractCommand;
import commands.WriteTheValues;
import entities.HumanBeing;

import java.util.Scanner;
import java.util.Stack;

public class RemoveAt extends AbstractCommand {//Сделана полностью
    @Override
    public boolean function() {
        System.out.println("Эта команда не используется без аргументов");
        return false;
    }

    @Override
    public boolean function(String[] arguments) {
        try{
            int id = -1;
            try {
                id = Integer.parseInt(arguments[0]);
            } catch (NumberFormatException e) {
                System.out.println("Введены некорректные данные из файла");
                id = WriteTheValues.checkTheCorrect(id,"Введите значение id повторно");
            }
            StackCollection.entitiesCollection.remove(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
