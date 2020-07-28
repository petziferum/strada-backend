package com.test.one.repository;

import com.test.one.model.ConstructionItem;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConstructionItemRepository extends MongoRepository<ConstructionItem, String> {

}
