package com.test.one.model.InspectionSecurityPackage.SecurityFlagPackage.SingleItems;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Water {
    SingleItem drainage;
    SingleItem sealing;
    SingleItem pumpStation;

    public Water(SingleItem drainage, SingleItem sealing, SingleItem pumpStation) {
        this.drainage = drainage;
        this.sealing = sealing;
        this.pumpStation = pumpStation;
    }

    public SingleItem getDrainage() {
        return drainage;
    }

    public void setDrainage(SingleItem drainage) {
        this.drainage = drainage;
    }

    public SingleItem getSealing() {
        return sealing;
    }

    public void setSealing(SingleItem sealing) {
        this.sealing = sealing;
    }

    public SingleItem getPumpStation() {
        return pumpStation;
    }

    public void setPumpStation(SingleItem pumpStation) {
        this.pumpStation = pumpStation;
    }
}
