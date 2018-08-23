package com.prd;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@MapperScan("com.prd.module.*.dao")
@EnableTransactionManagement //如果mybatis中service实现类中加入事务注解，需要此处添加该注解
@SpringBootApplication
public class PrdservletApplication {

    public static void main(String[] args) {
        SpringApplication.run(PrdservletApplication.class, args);
    }
}
