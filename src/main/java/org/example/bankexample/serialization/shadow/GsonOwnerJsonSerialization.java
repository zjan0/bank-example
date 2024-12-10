package org.example.bankexample.serialization.shadow;

import com.google.gson.Gson;
import com.google.inject.Inject;
import org.example.bankexample.persons.Owner;

public class GsonOwnerJsonSerialization
{
    @Inject
    private Gson gson;
    public String jsonSerializeOwner(Owner owner)
    {
        return this.gson.toJson(owner);
    }

}
