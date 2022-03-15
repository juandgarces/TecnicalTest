package co.com.pruebatecnica.exceptions;

public enum ExceptionsMessages {
    EXCEPTION_ERROR_SLEEP_TIME("Timeout error");

    private final String mensaje;

    ExceptionsMessages(String mensaje) {
        this.mensaje = mensaje;
    }


    public String getMessage() {
        return this.mensaje;
    }
}
