package com.test.one.controller;


import com.test.one.model.ConstructionIdentifier;
import com.test.one.model.ConstructionInformation;
import com.test.one.model.ConstructionItem;
import com.test.one.model.InspectionSecurityPackage.InspectionSecurity;
import com.test.one.service.ConstructionItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ConstructionItemController {

    @Autowired
    private ConstructionItemService ConstructionItemServ;

    @GetMapping("/findAllConstructionItem")
    public List<ConstructionItem> findAll() {
        return ConstructionItemServ.findAllConstructionItem();
    }

    @GetMapping("/createConstructionItem")
    public void create(String requiredAction, String damageDescription, ConstructionInformation constructioninformationget, ConstructionIdentifier constructionIdentifier, InspectionSecurity inspectionSecurity) {
        ConstructionItemServ.create(requiredAction, damageDescription, constructioninformationget, constructionIdentifier, inspectionSecurity);
    }

}
