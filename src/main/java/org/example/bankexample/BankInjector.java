package org.example.bankexample;

import com.google.inject.AbstractModule;
import org.example.bankexample.accounts.AccountNumberGenerator;
import org.example.bankexample.accounts.SlovakiaBankAccountNumberGenerator;
import org.example.bankexample.print.AccountDetailPrinter;
import org.example.bankexample.print.DetailPrinter;

public class BankInjector extends AbstractModule
{
    @Override
   protected void configure()
        {
          this.bind(AccountNumberGenerator.class).to(SlovakiaBankAccountNumberGenerator.class);
          this.bind(DetailPrinter.class).to(AccountDetailPrinter.class);
        }
}
