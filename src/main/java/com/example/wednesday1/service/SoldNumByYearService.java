package com.example.wednesday1.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.wednesday1.entity.NumOfCommunityMore200;
import com.example.wednesday1.entity.SoldNumByYear;

import java.util.List;

public interface SoldNumByYearService extends IService<SoldNumByYear> {

//    get all data from database table sold_num_by_year
    public List<SoldNumByYear> getAll();
}
