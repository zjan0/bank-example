package org.example.accounts;

import org.example.accounts.cards.Card;
import org.example.accounts.cards.CardFactory;
import org.example.persons.Owner;

import java.util.HashMap;
import java.util.Map;

public class BankAccount {

    private double balance;

    private Owner owner;

    private String accountNumber;

    private Map<String, Card> cards = new HashMap<>();

    public BankAccount(double balance, Owner owner, String accountNumber) {
        this.balance = balance;
        this.owner = owner;
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public Owner getOwner() {
        return owner;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Card getCard(String cardNumber) {
        return cards.get(cardNumber);
    }

    public void addCard(Card card) {
        cards.put(card.getNumber(), card);
    }

    public Map<String, Card> getCards() {
        return cards;
    }
}