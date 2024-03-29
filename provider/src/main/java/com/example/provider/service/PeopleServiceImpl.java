package com.example.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.common.model.People;
import com.example.common.service.PeopleService;

import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @author: chuan
 * @create: 2019-10-09 16:54
 * @note
 **/
@Service(version = "1.0.0")
public class PeopleServiceImpl implements PeopleService {
    @Override
    public People getPeople(People people) {
        people.setId(1);
        people.setName("ddd");
        return people;
    }

    @Override
    public Map<String, Object> test() {
        Map<String,Object> resMap = new HashMap<>();
        resMap.put("ddd","test");
        return resMap;
    }
}
