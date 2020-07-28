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
    Infrastructure infrastructure;
    BuildingComponent buildingComponent;

    public SecurityFlag(String chloridePollution , Infrastructure infrastructure, BuildingComponent buildingComponent) {
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

    public Infrastructure getInfrastructure() {
        return infrastructure;
    }

    public void setInfrastructure(Infrastructure infrastructure) {
        this.infrastructure = infrastructure;
    }

    public BuildingComponent getBuildingComponent() {
        return buildingComponent;
    }

    public void setBuildingComponent(BuildingComponent buildingComponent) {
        this.buildingComponent = buildingComponent;
    }
}
