package com.example.wednesday1.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.wednesday1.entity.NumOfCommunity;

import java.util.List;

public interface NumOfCommunityService extends IService<NumOfCommunity> {

//    get all data from database table num_of_community
    public List<NumOfCommunity> getAll();
}
