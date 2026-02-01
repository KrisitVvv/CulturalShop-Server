package com.example.culturalshop_back.Controller;

import com.example.culturalshop_back.Domain.Goods;
import com.example.culturalshop_back.Service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class GetGoodsList {
    @Autowired
    private GoodsService goodsService;
    @RequestMapping("/getgoodslist")
    public List<Goods> selectAllGoods(){
        return goodsService.selectAllGoods();
    }
}
