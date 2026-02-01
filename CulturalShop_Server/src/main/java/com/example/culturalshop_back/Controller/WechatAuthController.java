package com.example.culturalshop_back.Controller;

import com.example.culturalshop_back.Domain.WechatAuthResult;
import com.example.culturalshop_back.Service.WechatAuthService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WechatAuthController {

    private final WechatAuthService wechatAuthService;

    public WechatAuthController(WechatAuthService wechatAuthService) {
        this.wechatAuthService = wechatAuthService;
    }

    @GetMapping("/wechat/code2Session")
    public WechatAuthResult code2Session(@RequestParam String code) {
        return wechatAuthService.code2Session(code);
    }
}