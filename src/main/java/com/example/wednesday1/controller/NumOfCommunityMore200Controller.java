package com.example.wednesday1.controller;

import com.example.wednesday1.entity.NumOfCommunity;
import com.example.wednesday1.entity.NumOfCommunityMore200;
import com.example.wednesday1.service.NumOfCommunityService;
import com.example.wednesday1.service.NumOfCommunityServiceMore200Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/numOfCommunityMore200")
public class NumOfCommunityMore200Controller {

    @Autowired
    private NumOfCommunityServiceMore200Service numOfCommunityServiceMore200Service;

//    getAll
    @RequestMapping("/getAll")
    List<NumOfCommunityMore200> getAll() {

        return numOfCommunityServiceMore200Service.getAll();
    }


}
