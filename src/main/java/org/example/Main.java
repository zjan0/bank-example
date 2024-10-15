package org.example;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class Main
{
    public static void main(String[] args)
    {
        //App app = new App();
        try
        {
            //app.run();
            Injector injector= Guice.createInjector(new Bankinjector());
            App app=injector.getInstance(App.class);
            app.run();
        }
        catch (ArithmeticException e)
        {
            System.out.println("Pocitas blbe, " + e.getMessage());
        }
        catch (Throwable thr)
        {
            thr.printStackTrace();
            System.out.println("Neco se ti pokazilo");
        }
    }
}