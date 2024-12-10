package org.example.bankexample;
import com.google.inject.Inject;
import org.example.bankexample.accounts.*;
import org.example.bankexample.bankinterest.InterestCalculator;
import org.example.bankexample.cards.Card;
import org.example.bankexample.persons.Owner;
import org.example.bankexample.persons.OwnerFactory;
import org.example.bankexample.persons.PersonJsonSerializationService;
import org.example.bankexample.serialization.BankAccounttoJson;
import org.example.bankexample.serialization.CardtoJson;
import org.example.bankexample.serialization.OwnertoJson;

import java.util.Map;

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
    //@Inject
    //private BankAccount bankAccount;
   // @Inject
   // private CardtoJson cardtoJson;
    @Inject
    private BankAccounttoJson bankAccounttoJson;
    @Inject
    private OwnertoJson ownertoJson;
    @Inject
    private InvestBankAccount investBankAccount;
    @Inject
    private InterestCalculator interestCalculator;
    @Inject
    private ATM atm;
    @Inject
    private BankAccountFacade bankAccountFacade;
    @Inject
    private MoneyTransferService moneyTransferService;
    @Inject
    private PersonJsonSerializationService personJsonSerializationService;
    @Inject
    private OwnerFactory ownerFactory;
    @Inject
    private BankAccountFactory bankAccountFactory;
    private void testBank() throws Exception {
        Owner owner = this.ownerFactory.createOwner("Tomas", "Pesek", "123");
        BankAccount accountOne = this.bankAccountFacade.createBankAccount(owner, 500,false);
        BankAccount accountTwo = this.bankAccountFactory.createStudentBankAccount(owner, 1500, "expirace");
        BankAccount accountThree = this.bankAccountFactory.createSavingBankAccount(owner, 1500);
        if (accountTwo instanceof StudentBankAccount)
        {
            String expire = ((StudentBankAccount) accountTwo).getStudentStudiesConfirmationExpire();
            System.out.println(expire);
        }
        if (accountThree instanceof Interesting)
        {
            double interest = ((Interesting) accountThree).getInterest();
            System.out.println(interest);
        }
        System.out.println("Bank account balance: " + accountOne.getBalance());
        moneyTransferService().addMoney(accountOne, 100);
        moneyTransferService().addMoney(accountOne, 10);
        moneyTransferService().addMoney(accountOne, 600);
        moneyTransferService().subMoney(accountOne, 150);
        moneyTransferService().transferMoneyBetweenAccounts(accountOne, accountTwo, 100);
        Card Card = null;
        for (Map.Entry<String, Card> entrySet : accountOne.getCards().entrySet()) {
            Card = entrySet.getValue();
        }
        //this.atm.withdrawMoney(Card.getNumber(), Card.getPin(), 500);
        String BankAccountJson= this.bankAccounttoJson.GsonSerilazeBankAccount(accountOne);
        //String CardJson= this.bankAccount.AccountsTojson();
        //String CardJson=this.cardtoJson.GsonSerilazeCard(accountOne.cards);
        String OwnerJson= this.ownertoJson.GsonSerilazeowner(owner);
        System.out.println("a");
        System.out.println(BankAccountJson);
        //System.out.println(CardJson);
        System.out.println(OwnerJson);
        System.out.println("a");
    }

    private MoneyTransferService moneyTransferService()
    {
        return moneyTransferService;
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
