package org.example.bankexample.print;

import org.example.bankexample.accounts.BankAccount;
import org.example.bankexample.accounts.SavingBankAccount;
import org.example.bankexample.accounts.StudentBankAccount;

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