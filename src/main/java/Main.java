//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import Exceptions.DoesNotExistException;
import Exceptions.StupidUserException;
import collections.CommandCollection;
import collections.HistoryCollection;
import collections.InfoFail;
import collections.JavaIO;
import commands.AbstractCommand;

import java.util.Scanner;
import java.util.Set;
import java.util.regex.PatternSyntaxException;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        InfoFail.readFile();

        try {
            JavaIO.CSVCreateObject();
        } catch (StupidUserException var11) {
            System.exit(1);
        }

        CommandCollection.commandManager();
        Set<String> keys = CommandCollection.commandColl.keySet();
        Scanner scanner = new Scanner(System.in);
        System.out.println("For a list of commands, type help");

        while(true) {
            while(true) {
                String command;
                String[] arguments;
                while(true) {
                    System.out.print("Please enter the command: ");
                    if (!scanner.hasNext()) {
                        System.out.println("Wrong input, forced shutdown");
                        return;
                    }

                    String input;
                    while(true) {
                        try {
                            input = scanner.nextLine();
                            break;
                        } catch (IllegalStateException var12) {
                            System.out.print("Incorrect data, please re-enter: ");
                        }
                    }

                    input = input.trim();
                    command = input.split(" ")[0];

                    String strArgs;
                    try {
                        strArgs = input.replaceFirst(command, "").trim();
                    } catch (PatternSyntaxException var10) {
                        strArgs = "";
                    }

                    arguments = strArgs.split(",");

                    try {
                        if (!keys.contains(command)) {
                            throw new DoesNotExistException();
                        }
                        break;
                    } catch (DoesNotExistException var13) {
                        System.out.println("The command is not in the list of possible commands, please try again.");
                    }
                }

                if (arguments.length == 1 && arguments[0].isEmpty()) {
                    if (((AbstractCommand)CommandCollection.commandColl.get(command)).function()) {
                        System.out.println("The command completed successfully. Hooray!");
                        HistoryCollection.capacity(command);
                    } else {
                        System.out.println("An error occurred while executing the command. Do not judge strictly =(");
                    }
                } else if (((AbstractCommand)CommandCollection.commandColl.get(command)).function(arguments)) {
                    System.out.println("The command completed successfully. Hooray!");
                    HistoryCollection.capacity(command);
                } else {
                    System.out.println("An error occurred while executing the command. Do not judge strictly =((");
                }
            }
        }
    }
}
