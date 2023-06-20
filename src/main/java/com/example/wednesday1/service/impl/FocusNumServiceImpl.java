package com.example.wednesday1.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.wednesday1.entity.FocusNum;
import com.example.wednesday1.mapper.FocusNumMapper;
import com.example.wednesday1.service.FocusNumService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FocusNumServiceImpl extends ServiceImpl<FocusNumMapper, FocusNum> implements FocusNumService {

    @Override
    public List<FocusNum> getAll() {
        return this.query().list();
    }
}
