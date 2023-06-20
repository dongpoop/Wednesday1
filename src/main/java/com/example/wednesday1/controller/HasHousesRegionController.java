package com.example.wednesday1.controller;

import com.example.wednesday1.entity.HasHousesRegion;
import com.example.wednesday1.entity.HasNotHouses;
import com.example.wednesday1.service.HasHousesRegionService;
import com.example.wednesday1.service.HasNotHousesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/hasHousesRegion")
public class HasHousesRegionController {

    @Autowired
    private HasHousesRegionService hasHousesRegionService;

//    getAll
    @RequestMapping("/getAll")
    List<HasHousesRegion> getAll() {

        return hasHousesRegionService.getAll();
    }


}
