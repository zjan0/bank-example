package org.example.bankexample.persons;

public class PersonJsonSerializationService
{
    public String serializeOwner(Owner owner)
    {
        StringBuilder builder= new StringBuilder();
        builder.append("{");
        builder.append("\\ \\");
        builder.append("name:");
        builder.append(owner.getName());
        builder.append("\\");
        builder.append("lastname:");
        builder.append(owner.getSurname());
        builder.append("\\");
        builder.append("personalid:");
        builder.append(owner.getPersonId());
        builder.append("\\");
        builder.append("}");
        return builder.toString();
    }
}
