package com.test.one.model.InspectionSecurityPackage;


import com.test.one.model.InspectionSecurityPackage.SecurityFlagPackage.BuildingComponent;
import com.test.one.model.InspectionSecurityPackage.SecurityFlagPackage.Infrastructure;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class SecurityFlag {
    @Id
    String Id;
    String chloridePollution;
    String infrastructure;
    String buildingComponent;

    public SecurityFlag(String chloridePollution, String infrastructure, String buildingComponent) {
        this.chloridePollution = chloridePollution;
        this.infrastructure = infrastructure;
        this.buildingComponent = buildingComponent;
    }

    public String getChloridePollution() {
        return chloridePollution;
    }

    public void setChloridePollution(String chloridePollution) {
        this.chloridePollution = chloridePollution;
    }

    public String getInfrastructure() {
        return infrastructure;
    }

    public void setInfrastructure(String infrastructure) {
        this.infrastructure = infrastructure;
    }

    public String getBuildingComponent() {
        return buildingComponent;
    }

    public void setBuildingComponent(String buildingComponent) {
        this.buildingComponent = buildingComponent;
    }
}
