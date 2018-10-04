package com.wxh.demo.springboot.dubbo.consumer.service;


import com.alibaba.dubbo.config.annotation.Reference;
import com.wxh.demo.api.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author wxh
 */
@Slf4j
@Component
public class UserServiceConsumer {

    @Reference
    private UserService userService;


    public String doLogin(String name) {
        return userService.login(name);
    }

}
