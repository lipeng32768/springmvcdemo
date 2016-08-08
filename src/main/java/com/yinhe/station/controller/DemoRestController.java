package com.yinhe.station.controller;

import com.yinhe.station.model.UserEntity;
import com.yinhe.station.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * User: lipeng32768@163.com
 * Date: 2016/8/7
 * Time:23:20
 */
@RestController
public class DemoRestController {
    @Autowired
    UserRepository userRepository;



    @RequestMapping(value="/springcontent/{name}",
            method= RequestMethod.GET)
    public  Hello say(@PathVariable String name) {

        Hello hello = new Hello();
      
        hello.setName(name);
       return hello;
    }
}