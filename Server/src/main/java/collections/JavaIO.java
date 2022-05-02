package collections;


import Exceptions.StupidUserException;
import commands.Command;
import commands.WriteTheValues;
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

    /**
     * this method writes a string to file
     * @param example
     */
    public static void writeToFile(String example) throws StupidUserException{
        String var10002 = (new File("")).getAbsolutePath();
        File file = new File(var10002 + File.separator + "/common/src/main/resources/text.txt");
        Scanner scanner = new Scanner(System.in);

        while(true) {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file, true);
                fileOutputStream.write(example.getBytes());
                fileOutputStream.close();
                return;
            } catch (IOException var4) {
                System.out.println("Problem with the file, please enter a new file");
                if (!scanner.hasNext()) {
                    throw new StupidUserException();
                }
                file = new File(scanner.nextLine());
            }
        }
    }

    public static void CSVCreateObject() throws StupidUserException {
        Scanner scanner = new Scanner(System.in);
        String relative = (new File("")).getAbsolutePath() + File.separator + "/common/src/main/resources";
        String child = "text2.txt";
        new StringBuilder();

        while(true) {
            try {
                File path = new File(relative, child);
                CSVParser parser = CSVParser.parse(path, Charset.defaultCharset(), CSVFormat.RFC4180);
                List<CSVRecord> parserlocal = parser.getRecords();
                Iterator var7 = parserlocal.iterator();

                while(var7.hasNext()) {
                    CSVRecord record = (CSVRecord)var7.next();
                    if (record.size() == 16) {
                        WriteTheValues.createObject(record);
                    }
                }

                return;
            } catch (IOException var9) {
                System.out.println("There were problems (does not exist or no rights) with the file");
                System.out.print("Enter the path to the file:");
                if (!scanner.hasNext()) {
                    throw new StupidUserException();
                }

                relative = scanner.nextLine();
                String[] strings ;
                strings = relative.split("/");
                child = strings[strings.length-1];
            }
        }
    }

    public static boolean readScript(String filepath) {
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
                            if (((Command)CommandCollection.commandColl.get(command)).function()) {
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
    }
}