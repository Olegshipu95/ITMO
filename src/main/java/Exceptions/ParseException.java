package Exceptions;

public class ParseException extends Exception{
    public ParseException() {
    }

    public ParseException(String message) {
        System.out.println(message);
    }
}
