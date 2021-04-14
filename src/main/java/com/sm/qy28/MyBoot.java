package com.sm.qy28;

import org.apache.logging.log4j.message.AsynchronouslyFormattable;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@SpringBootApplication
@MapperScan(basePackages = {"com.sm.qy28.mapper"})
@EnableTransactionManagement
@AsynchronouslyFormattable
public class MyBoot {
    public static void main(String[] args) {
        SpringApplication.run(MyBoot.class);
    }

}
