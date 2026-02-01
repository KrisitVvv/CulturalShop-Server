package com.example.culturalshop_back.Mapper;

import com.example.culturalshop_back.Domain.Order;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface OrderMapper {
    @Insert("INSERT INTO `order` (UID, goods, number, price, create_time) " +
            "VALUES (#{UID}, #{goods}, #{number}, #{price}, #{createTime})")
    int insert(Order order);
    List<Order> getOrdersByUID(@Param("UID") String UID);
}
