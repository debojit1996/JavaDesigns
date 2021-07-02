package com.debo.factory.exception;

public class InvalidGadgetException extends RuntimeException {
    private String msg;

    public InvalidGadgetException(String msg) {
        super(msg);
    }
}
