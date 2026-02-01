package com.example.culturalshop_back.Mapper;

import com.example.culturalshop_back.Domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
    @Select("SELECT * FROM user WHERE id = #{id}")
    User findById(String id);
    @Insert("INSERT INTO user (id, name) VALUES (#{id}, #{name})")
    int insertUser(User user);
}
