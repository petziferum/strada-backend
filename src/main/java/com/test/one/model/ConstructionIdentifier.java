package com.test.one.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class ConstructionIdentifier {
    @Id
    String Id;
    String constructionNumber;
    String owner = "undefined";

    public ConstructionIdentifier(String constructionNumber, String owner) {
        this.constructionNumber = constructionNumber;
        if(owner != null) {this.owner = owner;}
    }


    public String getConstructionNumber() {
        return constructionNumber;
    }

    public void setConstructionNumber(String constructionNumber) {
        this.constructionNumber = constructionNumber;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
