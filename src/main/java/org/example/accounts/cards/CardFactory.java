package org.example.accounts.cards;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import org.example.accounts.BankAccount;
@Singleton
public class CardFactory
{
    @Inject
    private CardNumberGenerator cardNumberGenerator;
    @Inject
    private CardPinGenerator cardPinGenerator;

    public Card createCard(BankAccount bankAccount)
    {
        Card card = new Card(
                this.cardNumberGenerator.generate(),
                this.cardPinGenerator.generate(),
                bankAccount
        );

        return card;
    }
}
