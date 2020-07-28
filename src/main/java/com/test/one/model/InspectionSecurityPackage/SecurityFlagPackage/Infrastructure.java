package com.test.one.model.InspectionSecurityPackage.SecurityFlagPackage;

import com.test.one.model.InspectionSecurityPackage.SecurityFlagPackage.SingleItems.Electricity;
import com.test.one.model.InspectionSecurityPackage.SecurityFlagPackage.SingleItems.Street;
import com.test.one.model.InspectionSecurityPackage.SecurityFlagPackage.SingleItems.Water;

import java.util.List;

public class Infrastructure {

    List<Street> street;
    List<Electricity> electricity;
    List<Water> water;

    public Infrastructure(List<Street> street, List<Electricity> electricity, List<Water> water) {
        this.street = street;
        this.electricity = electricity;
        this.water = water;
    }

    public List<Street> getStreet() {
        return street;
    }

    public void setStreet(List<Street> street) {
        this.street = street;
    }

    public List<Electricity> getElectricity() {
        return electricity;
    }

    public void setElectricity(List<Electricity> electricity) {
        this.electricity = electricity;
    }

    public List<Water> getWater() {
        return water;
    }

    public void setWater(List<Water> water) {
        this.water = water;
    }
}
