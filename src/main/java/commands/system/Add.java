package commands.system;

import collections.IdCollection;
import collections.StackCollection;
import commands.WriteTheValues;
import commands.AbstractCommand;
import entities.*;

import java.util.Scanner;

public class Add extends AbstractCommand {//Сделан полностью
    @Override
    public boolean function() {
        System.out.println("Эта команда не работает с аргументами");
       return false;
    }

    @Override
    public boolean function(String[] arguments) {
        if(arguments.length != 10){
            System.out.println("Неправильное количество аргументов(их должно быть 10), повторите команду.");
            return false;
        }
        try {
            commands.WriteTheValues.createObject(arguments);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
