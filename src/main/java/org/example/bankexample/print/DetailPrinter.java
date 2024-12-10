package org.example.bankexample.print;

import org.example.bankexample.accounts.BankAccount;

public interface DetailPrinter {
    public void printDetail(BankAccount account);

    public void printDetail(BankAccount account, double fee);
}
