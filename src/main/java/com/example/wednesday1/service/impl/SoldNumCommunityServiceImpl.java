package com.example.wednesday1.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.wednesday1.entity.SoldNumByYear;
import com.example.wednesday1.entity.SoldNumCommunity;
import com.example.wednesday1.mapper.SoldNumByYearMapper;
import com.example.wednesday1.mapper.SoldNumCommunityMapper;
import com.example.wednesday1.service.SoldNumByYearService;
import com.example.wednesday1.service.SoldNumCommunityService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SoldNumCommunityServiceImpl extends ServiceImpl<SoldNumCommunityMapper, SoldNumCommunity> implements SoldNumCommunityService {

    @Override
    public List<SoldNumCommunity> getAll() {
        return this.query().list();
    }
}
