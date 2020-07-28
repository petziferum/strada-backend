package com.test.one.model.InspectionSecurityPackage.SecurityFlagPackage.SingleItems;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class SubStructures {
    SingleItem constructionTransition;
    SingleItem substructure;
    SingleItem wallCladding;
    SingleItem retainingWall;
    SingleItem noiseBarrier;

    public SubStructures(SingleItem constructionTransition, SingleItem substructure, SingleItem wallCladding, SingleItem retainingWall, SingleItem noiseBarrier) {
        this.constructionTransition = constructionTransition;
        this.substructure = substructure;
        this.wallCladding = wallCladding;
        this.retainingWall = retainingWall;
        this.noiseBarrier = noiseBarrier;
    }

    public SingleItem getConstructionTransition() {
        return constructionTransition;
    }

    public void setConstructionTransition(SingleItem constructionTransition) {
        this.constructionTransition = constructionTransition;
    }

    public SingleItem getSubstructure() {
        return substructure;
    }

    public void setSubstructure(SingleItem substructure) {
        this.substructure = substructure;
    }

    public SingleItem getWallCladding() {
        return wallCladding;
    }

    public void setWallCladding(SingleItem wallCladding) {
        this.wallCladding = wallCladding;
    }

    public SingleItem getRetainingWall() {
        return retainingWall;
    }

    public void setRetainingWall(SingleItem retainingWall) {
        this.retainingWall = retainingWall;
    }

    public SingleItem getNoiseBarrier() {
        return noiseBarrier;
    }

    public void setNoiseBarrier(SingleItem noiseBarrier) {
        this.noiseBarrier = noiseBarrier;
    }
}
