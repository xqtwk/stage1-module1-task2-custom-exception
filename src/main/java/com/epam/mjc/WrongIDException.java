package com.epam.mjc;

public class WrongIDException extends IllegalArgumentException {
    public WrongIDException(String text) {
        super(text);
    }
}
