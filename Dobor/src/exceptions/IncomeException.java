package exceptions;

public class IncomeException extends Exception{
    public IncomeException() {

        super();
    }
    public IncomeException(String message) {
        super(message);
    }
    public IncomeException(String message, Throwable cause) {

        super(message, cause);
    }

    public IncomeException(Throwable cause) {

        super(cause);
    }
}
