package com.example.wednesday1.controller;

import com.example.wednesday1.entity.HasNotHouses;
import com.example.wednesday1.service.HasNotHousesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/hasNotHouses")
public class HasNotHousesController {

    @Autowired
    private HasNotHousesService hasNotHousesService;

//    getAll
    @RequestMapping("/getAll")
    List<HasNotHouses> getAll() {

        return hasNotHousesService.getAll();
    }


}
