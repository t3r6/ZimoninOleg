package lesson18;

public class WrongLoginException extends Exception {
    public WrongLoginException(String message) {
        super(message);
    }

    public WrongLoginException() {
        super();
    }

    @Override
    public String toString() {
        return "WrongLoginException{} " + super.toString();
    }
}
