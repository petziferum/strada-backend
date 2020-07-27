package com.test.one.model.InspectionSecurityPackage.SecurityFlagPackage;

import com.test.one.model.InspectionSecurityPackage.SecurityFlagPackage.SingleItems.CustomRoom;
import com.test.one.model.InspectionSecurityPackage.SecurityFlagPackage.SingleItems.RailingItem;
import com.test.one.model.InspectionSecurityPackage.SecurityFlagPackage.SingleItems.SubStructures;

import java.util.List;

public class BuildingComponent {

    List<RailingItem> railingItem;
    List<CustomRoom> customRoom;
    List<SubStructures> subStructures;

    public BuildingComponent(List<RailingItem> railingItem, List<CustomRoom> customRoom, List<SubStructures> subStructures) {
        this.railingItem = railingItem;
        this.customRoom = customRoom;
        this.subStructures = subStructures;
    }

    public List<RailingItem> getRailingItem() {
        return railingItem;
    }

    public void setRailingItem(List<RailingItem> railingItem) {
        this.railingItem = railingItem;
    }

    public List<CustomRoom> getCustomRoom() {
        return customRoom;
    }

    public void setCustomRoom(List<CustomRoom> customRoom) {
        this.customRoom = customRoom;
    }

    public List<SubStructures> getSubStructures() {
        return subStructures;
    }

    public void setSubStructures(List<SubStructures> subStructures) {
        this.subStructures = subStructures;
    }
}
