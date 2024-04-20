package Exceptions;

public class DuplicateSymbolException extends RuntimeException{
    public DuplicateSymbolException(String message) {
        super(message);
    }
}
