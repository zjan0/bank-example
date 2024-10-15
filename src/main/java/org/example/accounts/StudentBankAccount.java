package org.example.accounts;

import org.example.persons.Owner;

public class StudentBankAccount extends BankAccount {

    private String studentStudiesConfirmationExpire;

    public StudentBankAccount(double balance, Owner owner, String accountNumber) {
        super(balance, owner, accountNumber);

        this.studentStudiesConfirmationExpire = null;
    }

    public StudentBankAccount(double balance, Owner owner, String accountNumber, String studentStudiesConfirmationExpire) {
        super(balance, owner, accountNumber);

        this.studentStudiesConfirmationExpire = studentStudiesConfirmationExpire;
    }

    public String getStudentStudiesConfirmationExpire() {
        return studentStudiesConfirmationExpire;
    }
}
