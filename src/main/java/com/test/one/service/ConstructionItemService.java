package com.test.one.service;


import com.test.one.model.ConstructionIdentifier;
import com.test.one.model.ConstructionInformation;
import com.test.one.model.ConstructionItem;
import com.test.one.model.InspectionSecurityPackage.InspectionSecurity;
import com.test.one.repository.ConstructionItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ConstructionItemService {

    @Autowired
    private ConstructionItemRepository ConstructionItemRepo;

    public List<ConstructionItem> findAllConstructionItem() {
        return ConstructionItemRepo.findAll();
    }

    public ConstructionItem create(String requiredAction, String damageDescription, ConstructionInformation constructioninformationget, ConstructionIdentifier constructionIdentifier, InspectionSecurity inspectionSecurity) {
        return ConstructionItemRepo.save(new ConstructionItem(requiredAction, damageDescription, constructioninformationget, constructionIdentifier, inspectionSecurity));
    }

}
