package com.example.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.common.model.People;
import com.example.common.service.PeopleService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: chuan
 * @create: 2019-10-09 17:55
 * @note
 **/
@RestController
public class TestController {

    @Reference(version = "1.0.0")
    private PeopleService peopleService;

    @RequestMapping("/test")
    public People test(){
        return peopleService.getPeople(new People());
    }
}
