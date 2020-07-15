package com.test.one.controller;


import com.test.one.model.bauwerk;
import com.test.one.service.BauwerkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class bauwerkController {

    @Autowired
    private BauwerkService BauwerkSer;

    @PostMapping("/create")
    public String create(@RequestParam String firstName, @RequestParam String Owner, @RequestParam String Verantwortlich) {
        bauwerk b = BauwerkSer.create(firstName, Owner, Verantwortlich);
        return b.toString();
    }

    @GetMapping("/getBauwerke")
    public bauwerk getBauwerk(@RequestParam String firstName) {
        return BauwerkSer.getByFirstName(firstName);
    }

    @GetMapping("/getAll")
    public List<bauwerk> getAll() {
        return BauwerkSer.getAll();
    }

    @PostMapping("/update")
    public String updateBauwerk(@RequestParam String firstName, @RequestParam(required = false) String Owner, @RequestParam(required =  false) String Verantwortlich) {
        bauwerk b =  BauwerkSer.update(firstName, Owner, Verantwortlich);
        return b.toString();
    }

    @GetMapping("/delete")
    public String deleteBauwerk(@RequestParam String firstName) {
        BauwerkSer.delete(firstName);
        return "Deleted: "+firstName;
    }


}
