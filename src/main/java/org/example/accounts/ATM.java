package org.example.accounts;

import org.example.accounts.cards.CardNumberGenerator;

import java.util.Map;

public class ATM
{
    public void MoneyfromAtmatm(Map cards, int cardNumberGenerator, int amount)
    {
        for(int a=0;a<cards.size();a++)
        {
            if(cards.equals(cardNumberGenerator))
            {
                System.out.println(amount);
            }
            else
            {
                System.out.println("no card found");
            }
        }
    }
}
