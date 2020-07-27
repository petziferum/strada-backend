package com.test.one.model.InspectionSecurityPackage;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document
public class InspectionItem {

    @Id
    String Id;
    //InspectionTypes inspectionType;
    Date inspectionConclusion;
    String inspectionDescription;
    Date nextInspection;
    Person Inspector;

    public InspectionItem(Date inspectionConclusion, String inspectionDescription, Date nextInspection, Person inspector) {

        this.inspectionConclusion = inspectionConclusion;
        this.inspectionDescription = inspectionDescription;
        this.nextInspection = nextInspection;
        Inspector = inspector;
    }
}
