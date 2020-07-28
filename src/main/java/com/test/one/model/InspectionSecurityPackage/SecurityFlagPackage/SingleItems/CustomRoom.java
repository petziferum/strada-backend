package com.test.one.model.InspectionSecurityPackage.SecurityFlagPackage.SingleItems;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class CustomRoom {
    SingleItem storage;
    SingleItem stairs;

    public CustomRoom(SingleItem storage, SingleItem stairs) {
        this.storage = storage;
        this.stairs = stairs;
    }

    public SingleItem getStorage() {
        return storage;
    }

    public void setStorage(SingleItem storage) {
        this.storage = storage;
    }

    public SingleItem getStairs() {
        return stairs;
    }

    public void setStairs(SingleItem stairs) {
        this.stairs = stairs;
    }
}
