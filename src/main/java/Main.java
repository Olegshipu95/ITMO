import collections.*;
import commands.AbstractCommand;
import entities.HumanBeing;

import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        InfoFail.readFile();
        JavaIO.CSVCreateObject();
        CommandCollection.commandManager();
        String input;
        String command;
        Set<String> keys = CommandCollection.commandColl.keySet();
        String strArgs;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            while (true) {
                System.out.println("Введите, пожалуйста, команду: ");
                try {
                    input = scanner.nextLine();
                    break;
                } catch (NoSuchElementException|IllegalStateException e) {
                    System.out.println("Некорректные данные");
                }
            }
            command = input.split(" ")[0];
            strArgs = input.replaceFirst(command, "").trim();
            String[] arguments = strArgs.split(",");
            try {
                if (!(keys.contains(command))) throw new Exceptions.DoesNotExist();
            } catch (Exceptions.DoesNotExist e) {
                System.out.println("Команды нет в списке возможных, повторите ввод.");
                continue;
            }
            if ((arguments.length == 1) && (arguments[0].isEmpty())) {
                if (CommandCollection.commandColl.get(command).function()) {
                    System.out.println("Выполнение команды прошло успешно. Ура!");
                    HistoryCollection.capacity(command);
                } else System.out.println("В выполнении команды произошел сбой. Не судите строго=(");
            }
            else if (CommandCollection.commandColl.get(command).function(arguments)) {
                System.out.println("Выполнение команды прошло успешно. Ура!");
                HistoryCollection.capacity(command);
            } else System.out.println("В выполнении команды произошел сбой. Не судите строго=(");
        }
    }
}
