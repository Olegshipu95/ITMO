package collections;

public class Parser {
    public static String[][] substringsOfStream() {

        if(JavaIO.readFile() != "") {

            String[] strings = JavaIO.readFile().split("\n");
            String[][] parse = new String[strings.length][];
            for (int i = 0; i < strings.length; i++) {
                for (String l : strings) {
                     parse[i] = l.split(",");
                }
            }
            return parse;
        }
        else return null;
    }


}
