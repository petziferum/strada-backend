package com.test.one.model;


import com.test.one.model.InspectionSecurityPackage.InspectionSecurity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class ConstructionItem {
    @Id
    String Id;
    String requiredAction;
    String damageDescription;
    ConstructionInformation constructioninformationget;
    ConstructionIdentifier constructionIdentifier;
    InspectionSecurity inspectionSecurity;


    public ConstructionItem(String requiredAction, String damageDescription, ConstructionInformation constructioninformationget, ConstructionIdentifier constructionIdentifier, InspectionSecurity inspectionSecurity) {
        this.requiredAction = requiredAction;
        this.damageDescription = damageDescription;
        this.constructioninformationget = constructioninformationget;
        this.constructionIdentifier = constructionIdentifier;
        this.inspectionSecurity = inspectionSecurity;
    }

    public String getRequiredAction() {
        return requiredAction;
    }

    public void setRequiredAction(String requiredAction) {
        this.requiredAction = requiredAction;
    }

    public ConstructionInformation getConstructioninformationget() {
        return constructioninformationget;
    }

    public void setConstructioninformationget(ConstructionInformation constructioninformationget) {
        this.constructioninformationget = constructioninformationget;
    }

    public String getDamageDescription() {
        return damageDescription;
    }

    public void setDamageDescription(String damageDescription) {
        this.damageDescription = damageDescription;
    }

    public ConstructionIdentifier getConstructionIdentifier() {
        return constructionIdentifier;
    }

    public void setConstructionIdentifier(ConstructionIdentifier constructionIdentifier) {
        this.constructionIdentifier = constructionIdentifier;
    }

    public InspectionSecurity getInspectionSecurity() {
        return inspectionSecurity;
    }

    public void setInspectionSecurity(InspectionSecurity inspectionSecurity) {
        this.inspectionSecurity = inspectionSecurity;
    }
}

