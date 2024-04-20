package Exceptions;

public class GameDrawnException extends RuntimeException{
    public GameDrawnException(String message) {
        super(message);
    }
}
