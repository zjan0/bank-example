package org.example.bankexample.persons;

import com.google.inject.Inject;
import com.google.inject.Singleton;

//@XmlRootElement
@Singleton
public class Owner
{
    //@XmlElement(name="firstName")
    private String name;
    //@XmlElement(surname="lastName")
    private String surname;
    //@XmlElement(personId="personId")
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
