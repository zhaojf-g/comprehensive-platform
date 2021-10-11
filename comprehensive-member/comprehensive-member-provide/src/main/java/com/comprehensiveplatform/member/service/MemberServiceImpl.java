package com.comprehensiveplatform.member.service;

import org.apache.dubbo.config.annotation.DubboService;

@DubboService
public class MemberServiceImpl implements MemberService {

    @Override
    public void test() {
        System.out.println("123");
    }
}
