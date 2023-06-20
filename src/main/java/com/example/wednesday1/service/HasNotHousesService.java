package com.example.wednesday1.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.wednesday1.entity.HasHouses;
import com.example.wednesday1.entity.HasNotHouses;

import java.util.List;

public interface HasNotHousesService extends IService<HasNotHouses> {

//    get all data from database table has_houses
    public List<HasNotHouses> getAll();
}
