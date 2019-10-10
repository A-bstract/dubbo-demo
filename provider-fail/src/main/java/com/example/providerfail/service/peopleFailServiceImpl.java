package com.example.providerfail.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.common.model.People;
import com.example.common.service.PeopleService;

import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @author: chuan
 * @create: 2019-10-10 15:45
 * @note
 **/
@Service(version = "1.0.0")
public class peopleFailServiceImpl implements PeopleService {
    @Override
    public People getPeople(People people) {
        people.setName("失败");
        return people;
    }

    @Override
    public Map<String, Object> test() {
        Map<String, Object> resMap = new HashMap<>();
        resMap.put("ddd","失败");
        return resMap;
    }
}
