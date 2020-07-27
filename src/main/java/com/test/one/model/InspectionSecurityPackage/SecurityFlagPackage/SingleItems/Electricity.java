package com.test.one.model.InspectionSecurityPackage.SecurityFlagPackage.SingleItems;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Electricity {
    SingleItem guarding;
    SingleItem illumination;

    public Electricity(SingleItem guarding, SingleItem illumination) {
        this.guarding = guarding;
        this.illumination = illumination;
    }

    public SingleItem getGuarding() {
        return guarding;
    }

    public void setGuarding(SingleItem guarding) {
        this.guarding = guarding;
    }

    public SingleItem getIllumination() {
        return illumination;
    }

    public void setIllumination(SingleItem illumination) {
        this.illumination = illumination;
    }
}
