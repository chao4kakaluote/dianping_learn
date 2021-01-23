package com.example.dianping_learn_1;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.example.dianping_learn_1"})
@MapperScan("com.example.dianping_learn_1.dal")
public class DianpingLearn1Application {

    public static void main(String[] args) {
        SpringApplication.run(DianpingLearn1Application.class, args);
    }

}
