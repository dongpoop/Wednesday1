package com.example.wednesday1.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.wednesday1.entity.HasHouses;

import java.util.List;

public interface HasHousesService extends IService<HasHouses> {

//    get all data from database table has_houses
    public List<HasHouses> getAll();
}
