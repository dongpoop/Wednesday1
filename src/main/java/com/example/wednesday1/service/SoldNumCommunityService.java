package com.example.wednesday1.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.wednesday1.entity.SoldNumByYear;
import com.example.wednesday1.entity.SoldNumCommunity;

import java.util.List;

public interface SoldNumCommunityService extends IService<SoldNumCommunity> {

//    get all data from database table sold_num_by_year
    public List<SoldNumCommunity> getAll();
}
