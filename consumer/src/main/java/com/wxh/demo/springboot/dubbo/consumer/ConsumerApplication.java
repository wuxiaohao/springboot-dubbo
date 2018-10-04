package com.wxh.demo.springboot.dubbo.consumer;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import com.wxh.demo.springboot.dubbo.consumer.service.UserServiceConsumer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@EnableDubboConfiguration
public class ConsumerApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(ConsumerApplication.class);

        UserServiceConsumer userServiceConsumer= (UserServiceConsumer) context.getBean("userServiceConsumer");

        System.out.println(userServiceConsumer.doLogin("wuxiaohao"));

    }
}
