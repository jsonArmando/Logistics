package com.ground.logistics.exception;

public class LogisticsIdMismatchException extends RuntimeException {

    public LogisticsIdMismatchException() {
        super();
    }

    public LogisticsIdMismatchException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public LogisticsIdMismatchException(final String message) {
        super(message);
    }

    public LogisticsIdMismatchException(final Throwable cause) {
        super(cause);
    }
}