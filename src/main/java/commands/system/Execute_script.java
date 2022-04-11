package commands.system;

import collections.ExecuteFileCollection;
import collections.JavaIO;
import commands.AbstractCommand;

import java.util.Scanner;

public class Execute_script extends AbstractCommand {
    @Override
    public boolean function() {
        System.out.println("Эта команда используется с аргументами.");
        return false;
    }

    @Override
    public boolean function(String[] arguments) {
        String filepath = arguments[0];
        try {
            if (ExecuteFileCollection.executeFileCollection.contains(filepath)) {
                System.out.println("Данный адрес уже использовался, используйте другой");
                return false;
            }
            ExecuteFileCollection.executeFileCollection.add(filepath);
            if(JavaIO.readScript(filepath)) {
                System.out.println("Все прошло успешно");
                return true;
            }
            System.out.println("Произошел сбой во время скрипта");
            return false;
        }
        catch (Exception e) {
            System.out.println("Произошла ошибка.");
            return false;
        }
    }
}
