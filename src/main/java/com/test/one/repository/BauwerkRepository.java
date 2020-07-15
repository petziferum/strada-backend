package com.test.one.repository;

import com.test.one.model.bauwerk;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface BauwerkRepository extends MongoRepository<bauwerk, String> {

    public bauwerk findByFirstName(String Name);
    public List<bauwerk> findByOwner(String owner);
}
