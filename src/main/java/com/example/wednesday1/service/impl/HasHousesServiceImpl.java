package com.example.wednesday1.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.wednesday1.entity.FocusNum;
import com.example.wednesday1.entity.HasHouses;
import com.example.wednesday1.mapper.FocusNumMapper;
import com.example.wednesday1.mapper.HasHousesMapper;
import com.example.wednesday1.service.FocusNumService;
import com.example.wednesday1.service.HasHousesService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HasHousesServiceImpl extends ServiceImpl<HasHousesMapper, HasHouses> implements HasHousesService {

    @Override
    public List<HasHouses> getAll() {
        return this.query().list();
    }
}
