package org.example.bankexample.serialization;

import com.google.gson.Gson;
import com.google.inject.Inject;
import org.example.bankexample.accounts.BankAccount;

public class BankAccounttoJson
{
    @Inject
    private Gson gson;
    public String GsonSerilazeBankAccount(BankAccount bankAccount)
    {
        return this.gson.toJson(bankAccount);
    }
}
