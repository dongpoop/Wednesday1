package com.example.wednesday1.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.wednesday1.entity.FocusNum;

import java.util.List;

public interface FocusNumService extends IService<FocusNum> {

//    get all data from database table focus_num
    public List<FocusNum> getAll();
}
