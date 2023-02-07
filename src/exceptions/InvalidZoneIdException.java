package exceptions;

public class InvalidZoneIdException extends Exception {
    public InvalidZoneIdException(String errorMessage) {
        super(errorMessage);
    }
}
