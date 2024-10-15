package org.example.print;

import org.example.accounts.BankAccount;
import org.example.accounts.SavingBankAccount;
import org.example.accounts.StudentBankAccount;

public class AccountDetailPrinter implements DetailPrinter {

    public void printDetail(BankAccount account) {
        System.out.println(this.getPrefix(account) + " Bank account balance: " + account.getBalance());
    }

    public void printDetail(BankAccount account, double fee) {
        System.out.println(this.getPrefix(account) + " Bank account balance: " + account.getBalance() + ", fee " + fee);
    }

    private String getPrefix(BankAccount account) {
        if (account instanceof StudentBankAccount) {
            return "Student ";
        }

        if (account instanceof SavingBankAccount) {
            return "Saving ";
        }

        return "";
    }
}