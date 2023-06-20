package com.example.wednesday1.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.wednesday1.entity.HasHousesRegion;

import java.util.List;

public interface HasHousesRegionService extends IService<HasHousesRegion> {

//    get all data from database table has_houses_region
    public List<HasHousesRegion> getAll();
}
