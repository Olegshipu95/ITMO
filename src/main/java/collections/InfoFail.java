package collections;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class InfoFail {

    static public String info;


    public static void readFile(){
        String outputFileName = new File("").getAbsolutePath() + File.separator + "/src/main/resources/info.txt";
        StringBuilder line = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(outputFileName))) {
            String local;
            while ((local = reader.readLine()) != null) {
                line.append(local + "\n");
            }
        }
        catch (IOException e) {
            System.out.println("Проблемы с файлом с информацией о коллекции");
        }
        if (!(line.length()>0)) System.out.println("Проблема с файлом о коллекции");
        info = line.toString();
    }
    public static String infoCol(int x){
        StringBuilder line = new StringBuilder(info);
        line.append("Длина коллекции:"+x);
        return line.toString().trim();
    }
}
