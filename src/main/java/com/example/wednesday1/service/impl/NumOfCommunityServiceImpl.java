package com.example.wednesday1.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.wednesday1.entity.HasNotHouses;
import com.example.wednesday1.entity.NumOfCommunity;
import com.example.wednesday1.mapper.HasNotHousesMapper;
import com.example.wednesday1.mapper.NumOfCommunityMapper;
import com.example.wednesday1.service.HasNotHousesService;
import com.example.wednesday1.service.NumOfCommunityService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NumOfCommunityServiceImpl extends ServiceImpl<NumOfCommunityMapper, NumOfCommunity> implements NumOfCommunityService {

    @Override
    public List<NumOfCommunity> getAll() {
        return this.query().list();
    }
}
