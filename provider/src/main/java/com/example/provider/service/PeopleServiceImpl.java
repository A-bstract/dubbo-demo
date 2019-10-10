package com.example.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.common.model.People;
import com.example.common.service.PeopleService;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: chuan
 * @create: 2019-10-09 16:54
 * @note
 **/
@Component
@Service(version = "1.0.0")
public class PeopleServiceImpl implements PeopleService {
    @Override
    public People getPeople(People people) {
        people.setId(1);
        people.setName("ddd");
        return people;
    }
}
