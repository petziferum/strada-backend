package com.test.one.model.InspectionSecurityPackage.SecurityFlagPackage.SingleItems;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class RailingItem {
    SingleItem edged;
    SingleItem securityRailing;
    SingleItem touchProtection;
    SingleItem mainStructure;

    public RailingItem(SingleItem edged, SingleItem securityRailing, SingleItem touchProtection, SingleItem mainStructure) {
        this.edged = edged;
        this.securityRailing = securityRailing;
        this.touchProtection = touchProtection;
        this.mainStructure = mainStructure;
    }

    public SingleItem getEdged() {
        return edged;
    }

    public void setEdged(SingleItem edged) {
        this.edged = edged;
    }

    public SingleItem getSecurityRailing() {
        return securityRailing;
    }

    public void setSecurityRailing(SingleItem securityRailing) {
        this.securityRailing = securityRailing;
    }

    public SingleItem getTouchProtection() {
        return touchProtection;
    }

    public void setTouchProtection(SingleItem touchProtection) {
        this.touchProtection = touchProtection;
    }

    public SingleItem getMainStructure() {
        return mainStructure;
    }

    public void setMainStructure(SingleItem mainStructure) {
        this.mainStructure = mainStructure;
    }
}
