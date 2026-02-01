package com.example.culturalshop_back.Service;

import com.example.culturalshop_back.Domain.Goods;
import com.example.culturalshop_back.Mapper.GoodsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsService {
    @Autowired
    private GoodsMapper goodsMapper;
    public List<Goods> selectAllGoods(){
        return goodsMapper.selectAllGoods();
    }
}
