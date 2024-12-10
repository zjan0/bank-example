package org.example.bankexample.serialization;

import com.google.gson.Gson;
import com.google.inject.Inject;
import org.example.bankexample.persons.Owner;

public class OwnertoJson
{
    @Inject
    private Gson gson;
    public String GsonSerilazeowner(Owner owner)
    {
        return this.gson.toJson(owner);
    }
}
