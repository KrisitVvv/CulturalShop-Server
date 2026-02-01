package com.example.culturalshop_back.Mapper;

import com.example.culturalshop_back.Domain.Goods;

import java.util.List;

public interface GoodsMapper {
    public List<Goods> selectAllGoods();
}
