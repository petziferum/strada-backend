package com.test.one.model.InspectionSecurityPackage;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document
public class InspectionItem {

    @Id
    String Id;
    //InspectionTypes inspectionType;
    String inspectionConclusion;
    String inspectionDescription;
    String nextInspection;
    Person Inspector;


    public InspectionItem() {
    }

    public InspectionItem(String inspectionConclusion, String inspectionDescription, String nextInspection, Person inspector) {

        this.inspectionConclusion = inspectionConclusion;
        this.inspectionDescription = inspectionDescription;
        this.nextInspection = nextInspection;
        this.Inspector = inspector;
    }


    public String getInspectionDescription() {
        return inspectionDescription;
    }

    public void setInspectionDescription(String inspectionDescription) {
        this.inspectionDescription = inspectionDescription;
    }

    public String getInspectionConclusion() {
        return inspectionConclusion;
    }

    public void setInspectionConclusion(String inspectionConclusion) {
        this.inspectionConclusion = inspectionConclusion;
    }

    public String getNextInspection() {
        return nextInspection;
    }

    public void setNextInspection(String nextInspection) {
        this.nextInspection = nextInspection;
    }

    public Person getInspector() {
        return Inspector;
    }

    public void setInspector(Person inspector) {
        Inspector = inspector;
    }
}
