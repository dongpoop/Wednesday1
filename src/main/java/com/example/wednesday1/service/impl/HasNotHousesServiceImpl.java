package com.example.wednesday1.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.wednesday1.entity.HasNotHouses;
import com.example.wednesday1.mapper.HasNotHousesMapper;
import com.example.wednesday1.service.HasNotHousesService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HasNotHousesServiceImpl extends ServiceImpl<HasNotHousesMapper, HasNotHouses> implements HasNotHousesService {

    @Override
    public List<HasNotHouses> getAll() {
        return this.query().list();
    }
}
