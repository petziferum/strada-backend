package com.test.one.model.InspectionSecurityElements;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class InspectionItem {

    @Id
    String Id;
}
