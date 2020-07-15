package com.test.one.service;


import com.test.one.repository.BauwerkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.test.one.model.bauwerk;

import java.util.List;

@Service
public class BauwerkService {

    @Autowired
    private BauwerkRepository BauwerkRepo;

    public bauwerk create(String firstName, String Owner, String Verantwortlich) {
        return BauwerkRepo.save(new bauwerk(firstName, Owner, Verantwortlich));
    }

    public List<bauwerk> getAll() {
        return BauwerkRepo.findAll();
    }

    public bauwerk getByFirstName(String firstName) {
        return  BauwerkRepo.findByFirstName(firstName);
    }

    public bauwerk update(String firstName, String newOwner, String newVerantworlich) {
        bauwerk b = getByFirstName(firstName);
        if(!newOwner.isEmpty()) {
            b.setOwner(newOwner);
        }
        if(!newVerantworlich.isEmpty()) {
            b.setOwner(newVerantworlich);
        }
        return BauwerkRepo.save(b);
    }

    public void delete(String firstName) {
        bauwerk b = BauwerkRepo.findByFirstName(firstName);
        BauwerkRepo.delete(b);
    }
}
