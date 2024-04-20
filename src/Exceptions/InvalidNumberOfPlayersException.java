package Exceptions;

public class InvalidNumberOfPlayersException extends RuntimeException{
    public InvalidNumberOfPlayersException(String message) {
        super(message);
    }
}
