package com.test.one.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import com.test.one.model.ConstructionItem;

import java.lang.reflect.Array;

@Document
public class ConstructionInformation {
    @Id
    String Id;
    Integer Budget;
    //Type ConstructionType
    Integer importanceToTraffic;
    Boolean pedestrianBridge;
    //Array appendedConstructions;


    public ConstructionInformation(Integer budget, Integer importanceToTraffic, Boolean pedestrianBridge) {

        Budget = budget;
        this.importanceToTraffic = importanceToTraffic;
        this.pedestrianBridge = pedestrianBridge;
    }


    public Integer getBudget() {
        return Budget;
    }

    public void setBudget(Integer budget) {
        Budget = budget;
    }

    public Integer getImportanceToTraffic() {
        return importanceToTraffic;
    }

    public void setImportanceToTraffic(Integer importanceToTraffic) {
        this.importanceToTraffic = importanceToTraffic;
    }

    public Boolean getPedestrianBridge() {
        return pedestrianBridge;
    }

    public void setPedestrianBridge(Boolean pedestrianBridge) {
        this.pedestrianBridge = pedestrianBridge;
    }



}
