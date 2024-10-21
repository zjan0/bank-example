package org.example.accounts;

import org.example.accounts.cards.CardNumberGenerator;

import java.util.Map;

public class ATM
{
    public int atm(Map cards, CardNumberGenerator cardNumberGenerator, int amount)
    {
        for(int a=0;a<cards.size();a++)
        {
            if(cards.equals(cardNumberGenerator))
            {
                return amount;
            }
            else
            {
                System.out.println("no card found");
            }
        }
        return 0;
    }
}
