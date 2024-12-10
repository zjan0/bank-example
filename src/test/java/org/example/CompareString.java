package org.example;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.example.bankexample.accounts.BankAccount;
import org.example.bankexample.accounts.BankAccountFactory;
import org.example.bankexample.BankInjector;
import org.example.bankexample.cards.Card;
import org.example.bankexample.cards.CardFactory;
import org.example.bankexample.persons.Owner;
import org.example.bankexample.persons.OwnerFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CompareString
{
    @Test
    public void Comparison()
    {
        assertEquals(1,Integer.compare(10,0));
        assertEquals(-1,Integer.compare(0,10));
        assertEquals("aa",String.format("aa","bb"));
        assertEquals(-1,Boolean.compare(false,true));
        assertEquals(false,Boolean.valueOf(" "));
        assertNotEquals(true,Boolean.compare(true,false));
        assertSame(-1,Character.compare('a','b'));
    }
    Injector i= Guice.createInjector(new BankInjector());
    private OwnerFactory ownerFactory;
    private BankAccountFactory bankAccountFactory;
    private CardFactory cardFactory;
    @BeforeEach
    void setUp()
    {
        this.cardFactory=i.getInstance(CardFactory.class);
        this.ownerFactory=i.getInstance(OwnerFactory.class);
        this.bankAccountFactory=i.getInstance(BankAccountFactory.class);
    }
    @Test @DisplayName("Bank card generator test")
    void createBankCard()
    {
        Owner ownerTest=this.ownerFactory.createOwner("Tomas","Pesek","123");
        assertEquals(ownerTest.getName(),"Tomas");
        assertEquals(ownerTest.getSurname(),"Pesek");
        assertEquals(ownerTest.getPersonId(),"123");
        BankAccount testbankAccount=this.bankAccountFactory.createBankAccount(ownerTest,1000);
        assertEquals(testbankAccount.getBalance(),1000);
        Card bankCardTest=this.cardFactory.createCard(testbankAccount);
    }
}
