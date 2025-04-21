package Exceptions;

public class ExceptionExample {
    public static void main(String[] args) {
        try {
            riskyMethod();
        } catch (CustomException e) {
            System.out.println("GEFANGEN " + e.getMessage());
        }
    }
    public static void riskyMethod() throws CustomException {
        throw new CustomException("ETWAS FALSCH!");
    }
}
