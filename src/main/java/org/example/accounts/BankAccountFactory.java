package org.example.accounts;

import com.google.inject.Singleton;
import org.example.accounts.cards.Card;
import org.example.accounts.cards.CardFactory;
import org.example.persons.Owner;
@Singleton
public class BankAccountFactory
{
    private AccountNumberGenerator bankAccountNumberGenerator;
    private BankAccount bankAccount;

    public BankAccountFactory(AccountNumberGenerator bankAccountNumberGenerator) {
        this.bankAccountNumberGenerator = bankAccountNumberGenerator;
    }
    public BankAccount crateBankAccount(Owner owner, double balance,boolean withcard)
    {
        return this.createBankAccount(owner,balance,withcard);
    }
    public BankAccount createBankAccount(Owner owner, double balance,boolean withcard) {
        String bankAccountNumber = this.bankAccountNumberGenerator.generateBankAccountNumber();
        if(withcard==true)
        {
            Card number=null;
            number=bankAccount.getCard(number);
            bankAccount.BankCard(number);
        }
        return new BankAccount(balance, owner, bankAccountNumber);

    }

    public BankAccount createBankAccount(Owner owner, double balance, String bankAccountNumber) {
        return new BankAccount(balance, owner, bankAccountNumber);
    }

    public BankAccount createStudentBankAccount(Owner owner, double balance) {
        String bankAccountNumber = this.bankAccountNumberGenerator.generateBankAccountNumber();

        return new StudentBankAccount(balance, owner, bankAccountNumber);
    }

    public BankAccount createSavingBankAccount(Owner owner, double balance) {
        String bankAccountNumber = this.bankAccountNumberGenerator.generateBankAccountNumber();

        return new SavingBankAccount(balance, owner, bankAccountNumber);
    }

    public BankAccount createStudentBankAccount(Owner owner, double balance, String studentStudiesConfirmationExpire) {
        String bankAccountNumber = this.bankAccountNumberGenerator.crateStudentBankAccount(owner,balance,studentStudiesConfirmationExpire);

        return new StudentBankAccount(balance, owner, bankAccountNumber, studentStudiesConfirmationExpire);
    }
}
