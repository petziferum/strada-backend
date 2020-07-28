package com.test.one.model.InspectionSecurityPackage.SecurityFlagPackage.SingleItems;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Street {
    SingleItem roadBed;
    SingleItem surfacingCycleFootpath;
    SingleItem curbStone;
    SingleItem joint;

    public Street(SingleItem roadBed, SingleItem surfacingCycleFootpath, SingleItem curbStone, SingleItem joint) {
        this.roadBed = roadBed;
        this.surfacingCycleFootpath = surfacingCycleFootpath;
        this.curbStone = curbStone;
        this.joint = joint;
    }

    public SingleItem getRoadBed() {
        return roadBed;
    }

    public void setRoadBed(SingleItem roadBed) {
        this.roadBed = roadBed;
    }

    public SingleItem getSurfacingCycleFootpath() {
        return surfacingCycleFootpath;
    }

    public void setSurfacingCycleFootpath(SingleItem surfacingCycleFootpath) {
        this.surfacingCycleFootpath = surfacingCycleFootpath;
    }

    public SingleItem getCurbStone() {
        return curbStone;
    }

    public void setCurbStone(SingleItem curbStone) {
        this.curbStone = curbStone;
    }

    public SingleItem getJoint() {
        return joint;
    }

    public void setJoint(SingleItem joint) {
        this.joint = joint;
    }
}
