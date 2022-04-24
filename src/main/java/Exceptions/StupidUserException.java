package Exceptions;

public class StupidUserException extends Exception {
    public StupidUserException() {
        System.out.println("So why did you press CTRL D?\nForced shutdown");
    }
}