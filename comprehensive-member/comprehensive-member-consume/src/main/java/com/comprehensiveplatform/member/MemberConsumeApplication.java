package com.comprehensiveplatform.member;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
public class MemberConsumeApplication {
    public static void main(String[] args) {
        SpringApplication.run(MemberConsumeApplication.class, args);
    }
}
