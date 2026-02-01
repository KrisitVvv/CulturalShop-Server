package com.example.culturalshop_back.Controller;

import com.example.culturalshop_back.Domain.Order;
import com.example.culturalshop_back.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/UploadOderForm")
    public String handleBuy(@RequestBody Order order) {
        try {
            boolean success = orderService.saveOrder(order);
            if (success) {
                return "New record created successfully";
            } else {
                return "Failed to create record";
            }
        } catch (Exception e) {
            e.printStackTrace();
            return "Error: " + e.getMessage();
        }
    }
    @PostMapping("/getOrder")
    public List<Order> getOrder(@RequestBody String UID) {
        String cleanUID = UID.replaceAll("\"", "");
        return orderService.getOrdersByUID(cleanUID);
    }
}