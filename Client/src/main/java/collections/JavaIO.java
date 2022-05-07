package collections;

import commands.Command;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.*;
/**
 * this class is using for communication with files(reading and writing)
 */
public class JavaIO {

    /*public static boolean readScript(String filepath) {
        try {
            Set keys = CommandCollection.commandColl.keySet();

            Scanner scanner;
            try {
                scanner = new Scanner(new File(filepath));
            } catch (FileNotFoundException var7) {
                System.out.println("Problems with the file, try the command again");
                return false;
            }

            while(scanner.hasNext()) {
                try {
                    String input = scanner.nextLine();

                    try {
                        String command = input.split(" ")[0];
                        String strArgs = input.replaceFirst(command, "").trim();
                        String[] arguments = strArgs.split(",");
                        if (!keys.contains(command)) {
                            throw new IllegalArgumentException();
                        }

                        if (arguments.length == 1 && arguments[0].isEmpty()) {
                            if () {
                                System.out.println("Выполнение команды прошло успешно. Ура!");
                                HistoryCollection.capacity(command);
                            } else {
                                System.out.println("An error occurred while executing the command. Do not judge strictly =(");
                            }
                        } else if (((Command)CommandCollection.commandColl.get(command)).function(arguments)) {
                            System.out.println("The command completed successfully. Hooray!");
                            HistoryCollection.capacity(command);
                        } else {
                            System.out.println("An error occurred while executing the command. Do not judge strictly =(");
                        }
                    } catch (IllegalArgumentException var8) {
                        System.out.println("The command is not in the list of possible commands, please try again.");
                    }
                } catch (IllegalStateException | NoSuchElementException var9) {
                    System.out.println("Incorrect data");
                }
            }

            return true;
        } catch (Exception var10) {
            return false;
        }
    }*/
}