package collections;

import commands.WriteTheValues;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.File;
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
    public static void writeToFile(String example) {
        String path = (new File("")).getAbsolutePath();
        File file = new File(path + File.separator + "/common/src/main/resources/text.txt");
        Scanner scanner = new Scanner(System.in);

        while(true) {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file, true);
                fileOutputStream.write(example.getBytes());
                fileOutputStream.close();
                return;
            } catch (IOException e) {
                System.out.println("Problem with the file, please enter a new file");
                if (!scanner.hasNext()) {
                    System.exit(0);
                }
                file = new File(scanner.nextLine());
            }
        }
    }

    public static void CSVCreateObject() {
        Scanner scanner = new Scanner(System.in);
        String relative = (new File("")).getAbsolutePath() + File.separator + "/common/src/main/resources";
        String child = "text2.txt";
        new StringBuilder();

        while(true) {
            try {
                File path = new File(relative, child);
                CSVParser parser = CSVParser.parse(path, Charset.defaultCharset(), CSVFormat.RFC4180);
                List<CSVRecord> parserlocal = parser.getRecords();
                Iterator iterator = parserlocal.iterator();

                while(iterator.hasNext()) {
                    CSVRecord record = (CSVRecord)iterator.next();
                    if (record.size() == 16) {
                        WriteTheValues.createObject(record);
                    }
                }

                return;
            } catch (IOException e) {
                System.out.println("There were problems (does not exist or no rights) with the file");
                System.out.print("Enter the path to the file:");
                if (!scanner.hasNext()) {
                    System.exit(0);
                }

                relative = scanner.nextLine();
                String[] strings ;
                strings = relative.split("/");
                child = strings[strings.length-1];
            }
        }
    }

    /*public static boolean readScript(String filepath) {
        try {
            Set keys = CommandCollection.getInstance().commandColl.keySet();

            Scanner scanner;
            try {
                scanner = new Scanner(new File(filepath));
            } catch (FileNotFoundException e) {
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
                            if (((Command)CommandCollection.getInstance().commandColl.get(command)).function()) {
                                System.out.println("Выполнение команды прошло успешно. Ура!");
                                HistoryCollection.getInstance().capacity(command);
                            } else {
                                System.out.println("An error occurred while executing the command. Do not judge strictly =(");
                            }
                        } else if (((Command)CommandCollection.getInstance().commandColl.get(command)).function(arguments)) {
                            System.out.println("The command completed successfully. Hooray!");
                            HistoryCollection.getInstance().capacity(command);
                        } else {
                            System.out.println("An error occurred while executing the command. Do not judge strictly =(");
                        }
                    } catch (IllegalArgumentException e) {
                        System.out.println("The command is not in the list of possible commands, please try again.");
                    }
                } catch (IllegalStateException | NoSuchElementException e) {
                    System.out.println("Incorrect data");
                }
            }

            return true;
        } catch (Exception e) {
            return false;
        }
    }*/
}