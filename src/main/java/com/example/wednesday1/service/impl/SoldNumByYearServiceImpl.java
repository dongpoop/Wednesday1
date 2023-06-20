package com.example.wednesday1.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.wednesday1.entity.NumOfCommunity;
import com.example.wednesday1.entity.SoldNumByYear;
import com.example.wednesday1.mapper.NumOfCommunityMapper;
import com.example.wednesday1.mapper.SoldNumByYearMapper;
import com.example.wednesday1.service.NumOfCommunityService;
import com.example.wednesday1.service.SoldNumByYearService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SoldNumByYearServiceImpl extends ServiceImpl<SoldNumByYearMapper, SoldNumByYear> implements SoldNumByYearService {

    @Override
    public List<SoldNumByYear> getAll() {
        return this.query().list();
    }
}
