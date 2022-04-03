import collections.*;
import commands.AbstractCommand;
import entities.HumanBeing;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args)  {
        StackCollection.fromFile();
        CommandCollection.commandManager();
        Scanner scanner = new Scanner(System.in);
        String command;
        Set<String> keys = CommandCollection.commandColl.keySet();

        while (true){
                System.out.println("Введите, пожалуйста, команду: ");
            try {
                command = scanner.nextLine();
                if()
            }
            catch (Exception e){
                System.out.println("Некорректные данные");
            }

        }
    }
}
