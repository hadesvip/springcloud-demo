package com.mapper;

import com.bean.User;

public interface UserMapper {
    int deleteByPrimaryKey(String userId);

    int insert(User record);

    int saveUser(User record);

    User getUser(String userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}