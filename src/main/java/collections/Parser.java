package collections;

import org.apache.commons.csv.CSVParser;

public class Parser {
    public static String[][] substringsOfStream() {

        if (JavaIO.readFile() != "") {

            String[] strings = JavaIO.readFile().split("\n");
            String[][] parse = new String[strings.length][];
            int i = 0;
            for (String l : strings) {
                parse[i] = l.split(",");
                i++;
            }
            return parse;
        } else return null;
    }


}
