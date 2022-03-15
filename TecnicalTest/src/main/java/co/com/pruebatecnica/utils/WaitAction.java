package co.com.pruebatecnica.utils;

import co.com.pruebatecnica.exceptions.MyBussinesExceptions;

import static co.com.pruebatecnica.exceptions.ExceptionsMessages.EXCEPTION_ERROR_SLEEP_TIME;

public class WaitAction {
    private WaitAction() {
        throw new IllegalStateException("WaitAction class");
    }

    public static void  waitAction(int timeInMilliseconds) {
        try {
            Thread.sleep(timeInMilliseconds * 1000);
        } catch (InterruptedException e) {
            throw new MyBussinesExceptions(EXCEPTION_ERROR_SLEEP_TIME.getMessage() + " " + e.getMessage());
        }

    }
}
