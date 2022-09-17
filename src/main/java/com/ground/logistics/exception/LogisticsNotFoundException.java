package com.ground.logistics.exception;

public class LogisticsNotFoundException extends RuntimeException {

    public LogisticsNotFoundException() {
        super();
    }

    public LogisticsNotFoundException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public LogisticsNotFoundException(final String message) {
        super(message);
    }

    public LogisticsNotFoundException(final Throwable cause) {
        super(cause);
    }
}