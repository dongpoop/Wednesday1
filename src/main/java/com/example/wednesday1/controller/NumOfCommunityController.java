package com.example.wednesday1.controller;

import com.example.wednesday1.entity.NumOfCommunity;
import com.example.wednesday1.service.NumOfCommunityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/numOfCommunity")
public class NumOfCommunityController {

    @Autowired
    private NumOfCommunityService numOfCommunityService;

//    getAll
    @RequestMapping("/getAll")
    List<NumOfCommunity> getAll() {

        return numOfCommunityService.getAll();
    }


}
