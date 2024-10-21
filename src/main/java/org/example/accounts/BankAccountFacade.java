package org.example.accounts;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import org.example.accounts.cards.CardFactory;
import org.example.persons.Owner;

import java.util.LinkedList;
import java.util.List;

@Singleton
public class BankAccountFacade
{
    private BankAccount bankAccount;
    private List<BankAccount> bankAccounts=new LinkedList<>();
    @Inject
    private BankAccountFactory bankAccountFactory;
    @Inject
    private GlobalCardStorage globalCardStorage;
    @Inject
    private GlobalBankAccountStorage globalBankAccountStorage;
    public BankAccount createBankAccount(Owner owner,double balance,boolean withCard)
    {
        BankAccount account=this.bankAccountFactory.createBankAccount(owner,balance);
        this.bankAccounts.add(account);
        /*if(withCard)
        {
            CardFactory card=this.CardFactory.createCard(account);
            account.BankCard(card);
        }*/

        return account;
    }
    public BankAccount crateStudentBankAccount(Owner owner,double balance,String expire)
    {
        BankAccount account=this.bankAccountFactory.createStudentBankAccount(owner,balance,expire);
        this.bankAccounts.add(account);
        return account;
    }

    public void MoneyfromAtmfacade(int cardnumber,int moneyamount)
    {
        this.bankAccount.MoneyfromAtm(cardnumber,moneyamount);

    }
}
