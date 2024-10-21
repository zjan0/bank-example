package org.example.accounts.cards;

import com.google.inject.Inject;

public class CardFactory
{
    private int amount;
    private String number;
    private String pin;
    @Inject
    private CardNumberGenerator cardNumberGenerator;
    @Inject
    private CardPinGenerator cardPinGenerator;
    private Card card;

    public Card createcard()
    {
        number=cardNumberGenerator.generate();
        pin=cardPinGenerator.generate();
        return new Card(number,pin,amount);
        //return new Card(this.cardNumberGenerator,this.cardPinGenerator);
    }
}
