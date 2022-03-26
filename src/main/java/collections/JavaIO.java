package collections;
import java.io.File;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;

public class JavaIO {

    public static String readFile(){
        String outputFileName = "D:\\text2.txt";//"C:\\Users\\Олеженька\\IdeaProjects\\5Laba\\data\\text2.txt"
        StringBuilder line = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(outputFileName))) {
            String local;
            while ((local = reader.readLine()) != null) {
                line.append(local + "\n");
            }
        }
        catch (IOException e) {
            e.printStackTrace();
            System.exit (1);
        }
        if (line.length()>0)line.deleteCharAt(line.length()-1);
        return line.toString().trim();
    }

    public static void writeTiFile(String example) throws IOException{
        File file = new File("C:\\Users\\Олеженька\\IdeaProjects\\My5Laba\\src\\main\\resources\\text.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file, true);
        fileOutputStream.write(example.getBytes());
        fileOutputStream.close();
    }
}