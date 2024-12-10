package org.example.bankexample.persons;

import com.google.inject.Singleton;

public class PersonIdValidator
{
    @Singleton
    public boolean isPersonIdValid(String personId) {
        return true;
    }

}
