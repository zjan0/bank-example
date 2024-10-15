package org.example.accounts.cards;

import com.google.inject.Inject;

public class CardFactory
{
    @Inject
    private CardNumberGenerator cardNumberGenerator;
    private CardPinGenerator cardPinGenerator;
    private Card card;

    public Card createcard(String number,String pin)
    {
        number=cardNumberGenerator.generate();
        pin=cardPinGenerator.generate();
        return new Card(number,pin);
        //return new Card(this.cardNumberGenerator,this.cardPinGenerator);
    }
}
