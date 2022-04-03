import collections.*;
import commands.AbstractCommand;
import entities.HumanBeing;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        StackCollection.fromFile();
        CommandCollection.commandManager();
        Scanner scanner = new Scanner(System.in);
        String command;
        Set<String> keys = CommandCollection.commandColl.keySet();

        while (true) {
            while (true) {
                System.out.println("Введите, пожалуйста, команду: ");
                try {
                    command = scanner.nextLine();
                    break;
                } catch (Exception e) {
                    System.out.println("Некорректные данные");
                }
            }
            try {
                if (!(keys.contains(command))) throw new Exceptions.DoesNotExist();
            } catch (Exceptions.DoesNotExist e) {
                System.out.println("Команды нет в списке возможных, повторите ввод.");
                continue;
            }
            if (CommandCollection.commandColl.get(command).function()) {
                System.out.println("Выполнение команды прошло успешно. Ура!");
                HistoryCollection.capacity(command);
            } else System.out.println("В выполнении команды произошел сбой. Не судите строго=(");
        }
    }
}
