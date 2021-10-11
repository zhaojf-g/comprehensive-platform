package com.comprehensiveplatform.member.controller;

import com.comprehensiveplatform.member.service.MemberService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("member")
public class MemberController {

    @DubboReference
    MemberService memberService;

    @GetMapping("/")
    public String test() {
        memberService.test();
        return "1";
    }

}
