package com.example.culturalshop_back.Service;

import com.example.culturalshop_back.Domain.Order;
import com.example.culturalshop_back.Mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
public class OrderService {
    @Autowired
    private OrderMapper orderMapper;
    @Transactional
    public boolean saveOrder(Order order) {
        order.setCreateTime(new Date());
        int rows = orderMapper.insert(order);
        return rows > 0;
    }
    public List<Order> getOrdersByUID(String UID) {
        return orderMapper.getOrdersByUID(UID);
    }
}