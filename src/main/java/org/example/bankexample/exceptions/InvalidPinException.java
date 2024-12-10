package org.example.bankexample.exceptions;

public class InvalidPinException extends RuntimeException {
    public InvalidPinException() {
        super("Invalid PIN");
    }
}
