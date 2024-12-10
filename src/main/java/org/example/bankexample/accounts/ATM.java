package org.example.bankexample.accounts;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import org.example.bankexample.cards.Card;
import org.example.bankexample.exceptions.InvalidPinException;

@Singleton
public class ATM
{
    @Inject
    private GlobalCardStorage globalCardStorage;
    @Inject
    private MoneyTransferService moneyTransferService;
    public void withdrawMoney(String cardNumber, String pin, double amount) {
        BankAccount bankAccount = globalCardStorage.getBankAccount(cardNumber);
        Card card = bankAccount.getCard(cardNumber);

        if (!card.getPin().equals(pin)) {
            throw new InvalidPinException();
        }

        this.moneyTransferService.subMoney(bankAccount, amount);
    }
}
