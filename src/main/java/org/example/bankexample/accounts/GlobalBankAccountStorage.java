package org.example.bankexample.accounts;

import com.google.inject.Singleton;
import java.util.LinkedList;
import java.util.List;
@Singleton
public class GlobalBankAccountStorage
{
    private List<BankAccount> bankAccounts = new LinkedList<>();

    public void add(BankAccount bankAccount) {
        this.bankAccounts.add(bankAccount);
    }
}
