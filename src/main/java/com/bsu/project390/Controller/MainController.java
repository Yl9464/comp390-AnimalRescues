package com.bsu.project390.Controller;
//defining URL paths

import com.bsu.project390.Model.Rescue;
import com.bsu.project390.Repository.RescueRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @Autowired
    RescueRepo rescueRepo;

    //inserting data to db
    @PostMapping("/addRescue")
    public void addRescue(@RequestBody Rescue rescue){
        rescueRepo.save(rescue);
    }
}
