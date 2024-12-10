package org.example.bankexample.accounts;

import com.google.inject.Inject;

import java.util.HashMap;
import java.util.Map;

public class InvestBankAccount
{
    /*@Inject
    private InvestCalc investCalc;
    public Map Investsort(int numberofinvest,int Money) {
        Map<Integer,InvestCalc> investments=new HashMap<>();
        int totalshare=0;
        String nullvalue=null;
        for(int i=0;i<numberofinvest;i++)
        {
            InvestCalc invcalc = new InvestCalc(
                    this.investCalc.Investsorter(numberofinvest,totalshare),
                    nullvalue
            );
            investments.put(i,invcalc);
        }
        return investments;
    }
    public Map Counterinv(Map investments)
    {
        for(int i=0;i<investments.size();i++)
        {
            /*InvestCalc invcalc=this.InvestCalc.InvestMath(investments.get(i));
            investments.put(i,invcalc);*/
       /* }
        return investments;
    }*/
}
