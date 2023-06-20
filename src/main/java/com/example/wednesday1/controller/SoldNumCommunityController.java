package com.example.wednesday1.controller;

import com.example.wednesday1.entity.SoldNumByYear;
import com.example.wednesday1.entity.SoldNumCommunity;
import com.example.wednesday1.service.SoldNumByYearService;
import com.example.wednesday1.service.SoldNumCommunityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/soldNumCommunity")
public class SoldNumCommunityController {

    @Autowired
    private SoldNumCommunityService soldNumCommunityService;

//    getAll
    @RequestMapping("/getAll")
    List<SoldNumCommunity> getAll() {

        return soldNumCommunityService.getAll();
    }


}
