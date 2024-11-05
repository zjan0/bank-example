package org.example.accounts.bankinterest;

import org.example.accounts.BankAccount;

public class InterestCalculator
{
    public void interestCalculator(BankAccount bankAccount,int startingvalue)
    {
        int interestvaluepercentage=10;
        int interestlength=0;
        int interestfrequancy=0;
        int finalinterestvalue=startingvalue+interestvaluepercentage+interestlength+interestfrequancy;
        System.out.println(finalinterestvalue);
        bankAccount.setInterest(finalinterestvalue);
    }
}
