package collections;

import java.io.File;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.Scanner;

public class JavaIO {
    public static String readFile() {
        String outputFileName = "D:\\text2.txt";//"C:\\Users\\Олеженька\\IdeaProjects\\5Laba\\data\\text2.txt"
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
}