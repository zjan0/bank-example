package org.example.bankexample.exceptions;

public class NoMoneyOnAccountException extends Exception {

    public NoMoneyOnAccountException(String message) {
        super(message);
    }
}
