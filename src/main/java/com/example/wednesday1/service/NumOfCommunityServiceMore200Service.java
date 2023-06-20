package com.example.wednesday1.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.wednesday1.entity.NumOfCommunity;
import com.example.wednesday1.entity.NumOfCommunityMore200;

import java.util.List;

public interface NumOfCommunityServiceMore200Service extends IService<NumOfCommunityMore200> {

//    get all data from database table num_of_community_more_200
    public List<NumOfCommunityMore200> getAll();
}
