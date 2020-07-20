package com.test.one.model.InspectionSecurityElements;

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
}
