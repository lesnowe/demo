package com.example.user.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import com.example.user.po.User;

import java.util.List;

@Mapper
public interface UserMapper {

    @Select("select * from T_USER")
    List<User> getAllUsers();

    @Delete("delete from T_USER where id=#{id}")
    void delete(Integer id);
}
