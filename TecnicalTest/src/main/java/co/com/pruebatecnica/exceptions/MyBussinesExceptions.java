package co.com.pruebatecnica.exceptions;

public class MyBussinesExceptions extends RuntimeException {

    public MyBussinesExceptions(String message, Throwable testErrorException) {
        super(message, testErrorException);
    }

    public MyBussinesExceptions(String message) {
        super(message);
    }


}

