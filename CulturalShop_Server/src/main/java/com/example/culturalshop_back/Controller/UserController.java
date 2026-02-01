package com.example.culturalshop_back.Controller;
import com.example.culturalshop_back.Domain.User;
import com.example.culturalshop_back.Service.UserService;

/*
* @Discription:物流车辆跟踪
* @Author:Zhao Yifan
* @Date:2024/11/22
*/


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public Object login(@RequestBody String openid) {
        String processedOpenid = openid.replaceAll("\"", "");
        User user = userService.getUserById(processedOpenid);

        if (user == null) {
            return new ResponseResult("未找到数据", null);
        } else {
            return new ResponseResult(null, user);
        }
    }
}
class ResponseResult {
    private String error;
    private Object data;

    public ResponseResult(String error, Object data) {
        this.error = error;
        this.data = data;
    }
    public String getError() { return error; }
    public void setError(String error) { this.error = error; }
    public Object getData() { return data; }
    public void setData(Object data) { this.data = data; }
}
