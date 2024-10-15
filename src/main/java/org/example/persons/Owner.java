package org.example.persons;

public class Owner
{
    private String name;

    private String surname;

    private String personId;
    public PersonIdValidator personIdValidator=new PersonIdValidator();

    public Owner(String name, String surname, String personId) {
        this.name = name;
        this.surname = surname;
        this.personId = personId;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
    public String getPersonId()
    {
        return personId;
    }
}
