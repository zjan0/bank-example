package org.example.accounts.cards;

import com.google.inject.Singleton;

import java.util.Random;

@Singleton
public class CardPinGenerator
{
    private int cardNumber;

    public String generate()
    {
        Random random=new Random();
        cardNumber=random.nextInt(10);
        return String.valueOf(cardNumber);
    }
}
