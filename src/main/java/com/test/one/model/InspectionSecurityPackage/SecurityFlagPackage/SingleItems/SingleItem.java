package com.test.one.model.InspectionSecurityPackage.SecurityFlagPackage.SingleItems;

import org.springframework.context.annotation.Description;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class SingleItem {
    @Id
    String Id;
    String name;
    String description;
    String value;

    public SingleItem(String name, String description, String value) {
        this.name = name;
        this.description = description;
        this.value = value;
    }

}
