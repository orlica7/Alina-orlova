package main.java.service;

public class MyInputException extends Exception{
    public MyInputException(String message){
        super(message);
    }

    public MyInputException() {
        super();
    }

    public MyInputException(String message, Throwable cause) {
        super(message, cause);
    }

    public MyInputException(Throwable cause) {
        super(cause);
    }

    protected MyInputException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
