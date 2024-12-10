package org.example.bankexample.accounts;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import org.example.bankexample.cards.Card;
import org.example.bankexample.persons.Owner;
import org.example.bankexample.serialization.CardtoJson;

import java.util.HashMap;
import java.util.Map;
//@XmlRootElement
//@Singleton
public class BankAccount {
    //@XmlElement
    private double balance;
    //@XmlElement
    private Owner owner;
    //@XmlElement
    private String accountNumber;
    //@XmlElement
    private Map<String, Card> cards = new HashMap<>();
    //@Inject
    //private CardtoJson cardtoJson;

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
    public void setInterest(double interest)
    {
        this.balance=interest+balance;
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
    /*public String AccountsTojson()
    {
        String card=this.cardtoJson.GsonSerilazeCard(cards);
        return card;
    }*/
}