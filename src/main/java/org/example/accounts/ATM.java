package org.example.accounts;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import org.example.accounts.cards.Card;
import org.example.accounts.exceptions.InvalidPinException;

import java.util.Map;
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
