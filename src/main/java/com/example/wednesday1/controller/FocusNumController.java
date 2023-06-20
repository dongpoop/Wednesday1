package com.example.wednesday1.controller;

import com.example.wednesday1.entity.FocusNum;
import com.example.wednesday1.service.FocusNumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/focusNum")
public class FocusNumController {

    @Autowired
    private FocusNumService focusNumService;

//    getAll
    @RequestMapping("/getAll")
    List<FocusNum> getAll() {

        return focusNumService.getAll();
    }


}
