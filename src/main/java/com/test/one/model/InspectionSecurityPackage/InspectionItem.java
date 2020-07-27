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

    public Date getInspectionConclusion() {
        return inspectionConclusion;
    }

    public void setInspectionConclusion(Date inspectionConclusion) {
        this.inspectionConclusion = inspectionConclusion;
    }

    public String getInspectionDescription() {
        return inspectionDescription;
    }

    public void setInspectionDescription(String inspectionDescription) {
        this.inspectionDescription = inspectionDescription;
    }

    public Date getNextInspection() {
        return nextInspection;
    }

    public void setNextInspection(Date nextInspection) {
        this.nextInspection = nextInspection;
    }

    public Person getInspector() {
        return Inspector;
    }

    public void setInspector(Person inspector) {
        Inspector = inspector;
    }
}
