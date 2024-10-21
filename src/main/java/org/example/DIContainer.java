package org.example;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import org.example.accounts.*;
import org.example.persons.OwnerFactory;
import org.example.persons.PersonIdValidator;
import org.example.persons.PersonJsonSerializationService;
import org.example.print.AccountDetailPrinter;
import org.example.print.DetailPrinter;
@Singleton
public class DIContainer
{
    /*public BankAccountFactory getBankAccountFactory;
    public OwnerFactory ownerFactory;
    private AccountNumberGenerator bankAccountNumberGenerator = new SlovakiaBankAccountNumberGenerator();
    private TransferFeeCalculator transferFeeCalculator = new TransferFeeCalculator();
    private PersonIdValidator personIdValidator = new PersonIdValidator();
    private DetailPrinter accountDetailPrinter=new AccountDetailPrinter();
    private MoneyTransferService moneyTransferService = new MoneyTransferService(transferFeeCalculator, accountDetailPrinter);
     @Inject
    private OwnerFactory ownerFactory;
    @Inject
    private BankAccountFactory bankAccountFactory;
    private PersonJsonSerializationService personJsonSerializationService=new PersonJsonSerializationService();
    public AccountNumberGenerator getBankAccountNumberGenerator() {
        return bankAccountNumberGenerator;
    }

    public TransferFeeCalculator getTransferFeeCalculator() {
        return transferFeeCalculator;
    }

    public DetailPrinter getAccountDetailPrinter() {
        return accountDetailPrinter;
    }

    public PersonIdValidator getPersonIdValidator() {
        return personIdValidator;
    }

    public MoneyTransferService getMoneyTransferService() {
        return moneyTransferService;
    }
    public OwnerFactory getOwnerFactory() {
        return ownerFactory;
    }

    public BankAccountFactory getBankAccountFactory() {
        return bankAccountFactory;
    }
    public PersonJsonSerializationService getPersonJsonSerializationService()
    {
        return personJsonSerializationService;
    }*/
}
