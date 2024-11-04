package org.example;

import com.google.inject.AbstractModule;
import org.example.accounts.AccountNumberGenerator;
import org.example.accounts.SlovakiaBankAccountNumberGenerator;
import org.example.print.AccountDetailPrinter;
import org.example.print.DetailPrinter;

public class Bankinjector extends AbstractModule
{
    @Override
   protected void configure()
        {
          this.bind(AccountNumberGenerator.class).to(SlovakiaBankAccountNumberGenerator.class);
          this.bind(DetailPrinter.class).to(AccountDetailPrinter.class);
        }
}
