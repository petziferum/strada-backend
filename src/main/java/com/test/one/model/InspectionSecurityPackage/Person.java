package com.test.one.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Person {

    @Id
    String Id;
    String firstName;
    String lastName;
    String initials;
}
