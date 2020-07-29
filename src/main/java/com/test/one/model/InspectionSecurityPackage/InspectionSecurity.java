package com.test.one.model.InspectionSecurityPackage;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class InspectionSecurity {
    @Id
    String Id;
    ClassificationItem classificationItem;
    InspectionItem inspectionItem;
    //SecurityFlag damageFlag;
    //SecurityFlag trafficSecurity;

    public InspectionSecurity(ClassificationItem classificationItem, InspectionItem inspectionItem) {

        this.classificationItem = classificationItem;
        this.inspectionItem = inspectionItem;
        //this.damageFlag = damageFlag;
        //this.trafficSecurity = trafficSecurity;
    }

    public ClassificationItem getClassificationItem() {
        return classificationItem;
    }

    public void setClassificationItem(ClassificationItem classificationItem) {
        this.classificationItem = classificationItem;
    }

    public InspectionItem getInspectionItem() {
        return inspectionItem;
    }

    public void setInspectionItem(InspectionItem inspectionItem) {
        this.inspectionItem = inspectionItem;
    }
}
