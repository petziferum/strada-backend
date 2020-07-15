package com.test.one.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Repository;

@Document
public class bauwerk {
    @Id
    String Id;
    String firstName;
    String Owner;
    String Verantwortlich;

    public bauwerk(String firstName, String Owner, String Verantwortlich) {
        this.firstName = firstName;
        this.Owner = Owner;
        this.Verantwortlich = Verantwortlich;
    }

    public String getfirstName() {
        return firstName;
    }

    public void setfirstName(String firstName) {
        firstName = firstName;
    }

    public String getOwner() {
        return Owner;
    }

    public void setOwner(String owner) {
        Owner = owner;
    }

    public String getVerantwortlich() {
        return Verantwortlich;
    }

    public void setVerantwortlich(String verantwortlich) {
        Verantwortlich = verantwortlich;
    }

    public String toString() {
        return "Bauwerk:: firstName: "+firstName+" Owner: "+Owner+" Verantwortlich: "+Verantwortlich;
    }
}
