package com.wxh.demo.springboot.dubbo.provider.service;


import com.alibaba.dubbo.config.annotation.Service;
import com.wxh.demo.api.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author wxh
 */
@Slf4j
@Component
@Service(interfaceClass = UserService.class)
public class UserServiceImpl implements UserService {

    public String login(String name) {
        log.info("进入dubbo服务端登录");
        return "name = "+name;
    }

}
