package com.sun.bilibili.dao;

import com.sun.bilibili.domain.User;
import com.sun.bilibili.domain.UserInfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao {

    User getUserByPhone(String phone);

    Integer addUser(User user);

    Integer addUserInfo(UserInfo userInfo);

    User getUserById(Long id);

    UserInfo getUserInfoByUserId(Long userId);

    void updateUserInfos(UserInfo userInfo);

    void updateUsers(User user);
}
