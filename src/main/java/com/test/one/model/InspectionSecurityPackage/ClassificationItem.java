package com.test.one.model.InspectionSecurityPackage;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document
public class ClassificationItem {

    @Id
    String Id;
    Float gradeCurrentCondition;
    String urgencyOfRestoration;
    Date yearOfUrgencyClassification;

    public ClassificationItem(Float gradeCurrentCondition, String urgencyOfRestoration, Date yearOfUrgencyClassification) {

        this.gradeCurrentCondition = gradeCurrentCondition;
        this.urgencyOfRestoration = urgencyOfRestoration;
        this.yearOfUrgencyClassification = yearOfUrgencyClassification;
    }
}
