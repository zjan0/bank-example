package org.example.accounts;

import org.example.persons.Owner;

public class SavingBankAccount extends BankAccount implements Interesting {

    public SavingBankAccount(double balance, Owner owner, String accountNumber) {
        super(balance, owner, accountNumber);
    }

    @Override
    public double getInterest() {
        if (this.getBalance() < 500000) {
            return 4;
        }

        return 1;
    }
}