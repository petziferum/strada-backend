package com.test.one.model.InspectionSecurityElements;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class SecurityFlag {

    @Id
    String Id;
    String chloridePollution;
    //infrastructure infrastructure
    //BuildingComponent buildingComponent
}
