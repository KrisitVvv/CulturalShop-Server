package com.example.culturalshop_back.Service;

import com.example.culturalshop_back.Domain.WechatAuthResult;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WechatAuthService {

    @Value("${wechat.mini.appid}")
    private String appid;

    @Value("${wechat.mini.secret}")
    private String secret;

    private final RestTemplate restTemplate;
    private final ObjectMapper objectMapper;

    public WechatAuthService(RestTemplate restTemplate, ObjectMapper objectMapper) {
        this.restTemplate = restTemplate;
        this.objectMapper = objectMapper;
    }

    public WechatAuthResult code2Session(String code) {
        String url = String.format("https://api.weixin.qq.com/sns/jscode2session?appid=%s&secret=%s&js_code=%s&grant_type=authorization_code", appid, secret, code);
        ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);

        try {
            return objectMapper.readValue(response.getBody(), WechatAuthResult.class);
        } catch (Exception e) {
            throw new RuntimeException("解析微信登录响应失败", e);
        }
    }
}