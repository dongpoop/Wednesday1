package com.example.wednesday1.controller;

import com.example.wednesday1.entity.FocusNum;
import com.example.wednesday1.entity.SoldNumByYear;
import com.example.wednesday1.service.FocusNumService;
import com.example.wednesday1.service.SoldNumByYearService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/soldNumByYear")
public class SoldNumByYearController {

    @Autowired
    private SoldNumByYearService soldNumByYearService;

//    getAll
    @RequestMapping("/getAll")
    List<SoldNumByYear> getAll() {

        return soldNumByYearService.getAll();
    }


}
