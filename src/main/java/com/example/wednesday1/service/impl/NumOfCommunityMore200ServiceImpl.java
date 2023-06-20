package com.example.wednesday1.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.wednesday1.entity.NumOfCommunity;
import com.example.wednesday1.entity.NumOfCommunityMore200;
import com.example.wednesday1.mapper.NumOfCommunityMapper;
import com.example.wednesday1.mapper.NumOfCommunityMore200Mapper;
import com.example.wednesday1.service.NumOfCommunityService;
import com.example.wednesday1.service.NumOfCommunityServiceMore200Service;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NumOfCommunityMore200ServiceImpl extends ServiceImpl<NumOfCommunityMore200Mapper, NumOfCommunityMore200> implements NumOfCommunityServiceMore200Service {

    @Override
    public List<NumOfCommunityMore200> getAll() {
        return this.query().list();
    }
}
