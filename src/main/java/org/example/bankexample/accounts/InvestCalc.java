package org.example.bankexample.accounts;

import java.awt.*;
import java.util.Random;

public class InvestCalc
{
    private int Money;
    private int Percent;
    private String InvestName;
    public int InvestMath()
    {
        Money=Money+Percent*Money/100;
        return Money;
    }
    public InvestCalc(int percent,String investName)
    {
        int money=100;
        this.Money=money;
        this.Percent=percent;
        this.InvestName=investName;

    }
    public int Investsorter(int sharenumber,int totalnumber)
    {
        if(sharenumber==1)
        {
            return 100-totalnumber;
        }
        else
        {
            Random random = new Random();
            return random.nextInt(10);
        }
    }
}
