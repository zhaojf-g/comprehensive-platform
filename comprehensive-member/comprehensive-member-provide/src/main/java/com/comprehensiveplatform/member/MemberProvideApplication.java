package com.comprehensiveplatform.member;

import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@NacosPropertySource(dataId = "member-provide-mysql.properties")
@EnableDubbo
public class MemberProvideApplication {
    public static void main(String[] args) {
        SpringApplication.run(MemberProvideApplication.class, args);
    }
}
