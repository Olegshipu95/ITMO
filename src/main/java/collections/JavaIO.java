package collections;

import commands.WriteTheValues;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeParseException;
import java.util.*;
import java.util.function.Function;

public class JavaIO {
    public static String readFile() {
        String outputFileName = new File("").getAbsolutePath() + File.separator + "/src/main/resources/text2.txt";
        StringBuilder line = new StringBuilder();

        while (true) {

            try (BufferedReader reader = new BufferedReader(new FileReader(outputFileName))) {
                String local;
                while ((local = reader.readLine()) != null) {
                    line.append(local + "\n");
                }
                break;
            } catch (IOException e) {
                System.out.println("Какие-то проблемы с файлом, впишите путь другого файла: ");
                Scanner scanner = new Scanner(System.in);
                outputFileName = scanner.nextLine();
                continue;
            }
        }
        if (line.length() > 0) line.deleteCharAt(line.length() - 1);
        return line.toString().trim();
    }

    public static void writeToFile(String example) {
        while (true) {
            System.out.println("Впишите путь к файлу");
            Scanner scanner = new Scanner(System.in);
            try {
                File file = new File(scanner.nextLine());
                FileOutputStream fileOutputStream = new FileOutputStream(file, true);
                fileOutputStream.write(example.getBytes());
                fileOutputStream.close();
                break;
            } catch (IOException e) {
                System.out.println("Проблема с файлом, впишите новый файл");
                continue;
            }
        }
    }

    public static void CSVCreateObject() {
        Scanner scanner = new Scanner(System.in);
        String outputFileName = new File("").getAbsolutePath() + File.separator + "/src/main/resources/text2.txt";
        StringBuilder line = new StringBuilder();
        CSVParser parser;
        List<CSVRecord> parserlocal;
        while (true) {
            try {
                parser = CSVParser.parse(outputFileName, CSVFormat.RFC4180);
                parserlocal = parser.getRecords();
                for (CSVRecord record : parserlocal) {
                    if(record.size()==16){
                        WriteTheValues.createObject(record);
                    }
                }
                break;
            } catch (IOException e) {
                System.out.println("Произошли проблемы с файлом");
                System.out.print("Впишите путь к файлу: ");
                outputFileName = scanner.nextLine();
            }
        }
    }



    public static boolean readScript(String filepath) {
        try {
            String command;
            String input;
            String strArgs;
            Set<String> keys = CommandCollection.commandColl.keySet();
            Scanner scanner;
            while (true) {
                try {
                    scanner = new Scanner(new File(filepath));
                    break;
                } catch (Exception e) {
                    System.out.println("Проблемы с файлом, попробуйте команду заново");
                    return false;
                }
            }
            while (scanner.hasNext()) {
                try {
                    input = scanner.nextLine();
                    try {
                        command = input.split(" ")[0];
                        strArgs = input.replaceFirst(command, "").trim();
                        String[] arguments = strArgs.split(",");
                        if (!(keys.contains(command))) throw new Exceptions.DoesNotExist();


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

                    } catch (Exceptions.DoesNotExist e) {
                        System.out.println("Команды нет в списке возможных, повторите ввод.");
                        continue;
                    }
                } catch (NoSuchElementException |IllegalStateException e) {
                    System.out.println("Некорректные данные");
                    continue;
                }
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}