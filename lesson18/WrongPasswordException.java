package lesson18;

public class WrongPasswordException extends Exception {
    public WrongPasswordException(String message) {
        super(message);
    }

    public WrongPasswordException() {
        super();
    }

    @Override
    public String toString() {
        return "WrongPasswordException{} " + super.toString();
    }
}
