package com.test.one.model.InspectionSecurityPackage;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.text.SimpleDateFormat;
import java.util.Date;

@Document
public class ClassificationItem {

    @Id
    String Id;
    Float gradeCurrentCondition;
    String urgencyOfRestoration;
    String yearOfUrgencyClassification;

    public ClassificationItem() {

    }

    public ClassificationItem(Float gradeCurrentCondition, String urgencyOfRestoration, String yearOfUrgencyClassification) {

        this.gradeCurrentCondition = gradeCurrentCondition;
        this.urgencyOfRestoration = urgencyOfRestoration;
        this.yearOfUrgencyClassification = yearOfUrgencyClassification;
    }

    public Float getGradeCurrentCondition() {
        return gradeCurrentCondition;
    }

    public void setGradeCurrentCondition(Float gradeCurrentCondition) {
        this.gradeCurrentCondition = gradeCurrentCondition;
    }

    public String getUrgencyOfRestoration() {
        return urgencyOfRestoration;
    }

    public void setUrgencyOfRestoration(String urgencyOfRestoration) {
        this.urgencyOfRestoration = urgencyOfRestoration;
    }

    public String getYearOfUrgencyClassification() {
        return yearOfUrgencyClassification;
    }

    public void setYearOfUrgencyClassification(String yearOfUrgencyClassification) {
        this.yearOfUrgencyClassification = yearOfUrgencyClassification;
    }
}
