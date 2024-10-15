package org.example;

import com.google.inject.Inject;
import org.example.accounts.BankAccount;
import org.example.accounts.BankAccountFactory;
import org.example.accounts.Interesting;
import org.example.accounts.StudentBankAccount;
import org.example.persons.Owner;
import org.example.persons.OwnerFactory;
import org.example.persons.PersonJsonSerializationService;

public class App
{
    public void run() throws Exception {
        System.out.println("Hello and welcome!");
        this.testBank();
        this.testCalc();
        this.testStrings();
        this.testNum();
        this.testFor();
    }
    @Inject
    private PersonJsonSerializationService personJsonSerializationService;
    @Inject
    private DIContainer serviceContainer;
    @Inject
    private OwnerFactory ownerFactory;
    @Inject
    private BankAccountFactory bankAccountFactory;
    private void testBank() throws Exception {
        //DIContainer servicesContainer = new DIContainer();
        Owner owner = this.ownerFactory.createOwner("Tomas", "Pesek", "123");
        BankAccount accountOne = this.serviceContainer.getBankAccountFactory.createBankAccount(owner, 500,false);
        BankAccount accountTwo = this.serviceContainer.getBankAccountFactory.createStudentBankAccount(owner, 1500, "expirace");
        BankAccount accountThree = this.serviceContainer.getBankAccountFactory.createSavingBankAccount(owner, 1500);
        if (accountTwo instanceof StudentBankAccount) {
            String expire = ((StudentBankAccount) accountTwo).getStudentStudiesConfirmationExpire();
            System.out.println(expire);
        }
        if (accountThree instanceof Interesting) {
            double interest = ((Interesting) accountThree).getInterest();
            System.out.println(interest);
        }
        System.out.println("Bank account balance: " + accountOne.getBalance());
        serviceContainer.getMoneyTransferService().addMoney(accountOne, 100);
        serviceContainer.getMoneyTransferService().addMoney(accountOne, 10);
        serviceContainer.getMoneyTransferService().addMoney(accountOne, 600);
        serviceContainer.getMoneyTransferService().subMoney(accountOne, 150);
        serviceContainer.getMoneyTransferService().transferMoneyBetweenAccounts(accountOne, accountTwo, 100);
    }

    private void testNum() {
        int a = 10;
        int b = 10;
        System.out.println(a + b);
    }

    private void testStrings() {
        String text = "Toto je testovaci retezec";
        System.out.println(text.length());

        char searchChar = 'a';
        int counter = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == searchChar) {
                counter++;
            }
        }
        System.out.println("pocet a: " + counter);
    }

    private void testFor() {
        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }

    private void testCalc() {
        Calc calculator = new Calculator();

        System.out.println(calculator.add(10, 20));
        System.out.println(calculator.sub(10, 20));
        System.out.println(calculator.mul(10, 20));
        System.out.println(calculator.div(10, 0));
    }
}
