package com.sm.qy28.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Component
public class SpringDataRedis {

    @Autowired
    private StringRedisTemplate redisTemplate;

    /**
     * 存redis
     * @param email
     * @param code
     */
    public void toredis(String email,String code){
        redisTemplate.opsForValue().set("code:"+email,code,3, TimeUnit.MINUTES);
    }


    /**
     * 取redis
      * @param email
     * @return
     */
    public String getRedis(String email){
        String s = redisTemplate.opsForValue().get("code:"+email);
        return s;
    }



}
