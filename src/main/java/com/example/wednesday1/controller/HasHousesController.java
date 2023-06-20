package com.example.wednesday1.controller;

import com.example.wednesday1.entity.HasHouses;
import com.example.wednesday1.service.HasHousesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/hasHouses")
public class HasHousesController {

    @Autowired
    private HasHousesService hasHousesService;

//    getAll
    @RequestMapping("/getAll")
    List<HasHouses> getAll() {

        return hasHousesService.getAll();
    }


}
