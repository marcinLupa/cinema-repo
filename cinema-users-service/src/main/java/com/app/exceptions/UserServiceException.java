package com.app.exceptions;

public class UserServiceException extends RuntimeException{
    private String message;

    public UserServiceException(String message) {
        this.message = message;
    }
}
