package com.test.one.model.InspectionSecurityPackage;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Person {

    @Id
    String Id;
    String firstName;
    String lastName;
    String initials;

    public Person(String firstName, String lastName, String initials) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.initials = initials;
    }
}
