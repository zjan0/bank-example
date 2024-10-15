package org.example.print;

import org.example.accounts.BankAccount;

public interface DetailPrinter {
    public void printDetail(BankAccount account);

    public void printDetail(BankAccount account, double fee);
}
