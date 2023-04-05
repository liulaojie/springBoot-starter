package com.itheima;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.redis.RedisProperties;
import org.springframework.context.ConfigurableApplicationContext;
import redis.clients.jedis.Jedis;

@SpringBootApplication
public class EnableApplication {
    public static void main(String[] args){
        ConfigurableApplicationContext applicationContext = SpringApplication.run(EnableApplication.class, args);
        //获取testCondition的bean
        Jedis bean = applicationContext.getBean(Jedis.class);
        System.out.println(bean);
    }
}
