package appDomain.exception;

public class EmptyQueueException extends RuntimeException {
    public EmptyQueueException() {
        super();
    }

    public EmptyQueueException(String message) {
        super(message);
    }

    public EmptyQueueException(String message, Throwable cause) {
        super(message, cause);
    }

    public EmptyQueueException(Throwable cause) {
        super(cause);
    }
}