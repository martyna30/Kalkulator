package com.kodilla.exception.nullPointer;

public class MessageNotSentException extends Exception {//teraz wyjątek jest checked
    public MessageNotSentException(final String message) {
        super(message);
    }
}
