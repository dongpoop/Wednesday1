package com.example.wednesday1.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.wednesday1.entity.HasHousesRegion;
import com.example.wednesday1.mapper.HasHousesRegionMapper;
import com.example.wednesday1.service.HasHousesRegionService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HasHousesRegionServiceImpl extends ServiceImpl<HasHousesRegionMapper, HasHousesRegion> implements HasHousesRegionService {

    @Override
    public List<HasHousesRegion> getAll() {
        return this.query().list();
    }
}
