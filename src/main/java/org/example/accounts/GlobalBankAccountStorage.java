package org.example.accounts;

import java.util.LinkedList;
import java.util.List;

public class GlobalBankAccountStorage
{
    private List<BankAccount> bankAccounts = new LinkedList<>();

    public void add(BankAccount bankAccount) {
        this.bankAccounts.add(bankAccount);
    }
}
