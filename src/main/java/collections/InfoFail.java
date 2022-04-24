package collections;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class InfoFail {
    public static String info;

    public InfoFail() {
    }

    public static void readFile() {
        String var10000 = (new File("")).getAbsolutePath();
        String outputFileName = var10000 + File.separator + "/src/main/resources/info.txt";
        StringBuilder line = new StringBuilder();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(outputFileName));

            String local;
            try {
                while((local = reader.readLine()) != null) {
                    line.append(local + "\n");
                }
            } catch (Throwable var6) {
                try {
                    reader.close();
                } catch (Throwable var5) {
                    var6.addSuppressed(var5);
                }

                throw var6;
            }

            reader.close();
        } catch (IOException var7) {
            System.out.println("Problems with the collection information file");
        }

        if (line.length() <= 0) {
            System.out.println("Problems with the collection information file");
        }

        info = line.toString();
    }

    public static String infoCol(int x) {
        StringBuilder line = new StringBuilder(info);
        line.append("Collection length:" + x);
        return line.toString().trim();
    }
}
