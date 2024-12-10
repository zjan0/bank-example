package org.example.bankexample.cards;

import org.example.bankexample.accounts.BankAccount;

public class Card
{
    private String number;
    private String pin;
    private BankAccount bankAccount;

    public Card(String number, String pin, BankAccount bankAccount) {
        this.number = number;
        this.pin = pin;
        this.bankAccount = bankAccount;
    }

    public String getNumber() {
        return number;
    }

    public String getPin() {
        return pin;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }
}
