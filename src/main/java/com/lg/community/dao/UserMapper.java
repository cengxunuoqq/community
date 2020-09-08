package com.lg.community.dao;

import com.lg.community.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
//spring的为@Repository,mybatis的是@Mapper
public interface UserMapper {

    User selectById(Integer id);

    User selectByName(String username);

    User selectByEmail(String email);

    int insertUser(User user);

    int updateStatus(Integer id,Integer status);

    int updateHeader(Integer id,String headerUrl);

    int updatePassword(Integer id,String password);

}
