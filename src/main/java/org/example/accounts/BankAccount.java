package org.example.accounts;

import org.example.accounts.cards.Card;
import org.example.accounts.cards.CardFactory;
import org.example.persons.Owner;

import java.util.Map;

public class BankAccount
{
    private ATM atm;
    private double balance;
    private Owner owner;
    private CardFactory cardFactory;
    private String accountNumber;
    private Map<String, Card> cardsInMap;
    public Card getCard(Card cardNumber)
{
    cardNumber=cardFactory.createcard();
    return cardNumber;
}

    public BankAccount(double balance, Owner owner, String accountNumber) {
        this.balance = balance;
        this.owner = owner;
        this.accountNumber = accountNumber;
    }
    public void BankCard(Card CardNumber)
    {
        cardsInMap.put(toString(),CardNumber);
    }
    public void MoneyfromAtm(int cardnumber,int amount)
    {
        this.atm.MoneyfromAtmatm(cardsInMap,cardnumber,amount);
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
}
