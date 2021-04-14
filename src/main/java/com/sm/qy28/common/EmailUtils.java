package com.sm.qy28.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class EmailUtils {

    @Autowired
    private JavaMailSender javaMailSender;

    @Async
    public  String sendEmail(String email){
        String uuid = UUID.randomUUID().toString().substring(0,6);
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setFrom("phcla<shandongvvip@163.com>");
        simpleMailMessage.setTo(email);
        simpleMailMessage.setSubject("登录验证码");
        simpleMailMessage.setText("你的登录验证码为："+uuid);
        javaMailSender.send(simpleMailMessage);

        return uuid;
    }

}
