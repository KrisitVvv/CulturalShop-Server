package com.example.culturalshop_back.Service;

import com.example.culturalshop_back.Domain.User;
import com.example.culturalshop_back.Mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User getUserById(String id) {
        return userMapper.findById(id);
    }
    @Transactional
    public boolean registerUser(User user) {
        User existingUser = userMapper.findById(user.getId());
        if (existingUser != null) {
            return false;
        }
        int result = userMapper.insertUser(user);
        return result > 0;
    }
}
