package com.service.impl;

import com.bean.User;
import com.mapper.UserMapper;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.DigestUtils;

import java.util.UUID;

/**
 * Created by wangyong on 17-3-1.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Transactional(readOnly = true)
    @Override
    public User getUser(String userId) {
        return null;
    }

    @Transactional
    @Override
    public int saveUser(String userName, String password, String desc) {
        User user = new User();
        user.setUserId(UUID.randomUUID().toString().replace("-", ""));
        user.setUserName(userName);
        user.setPassword(DigestUtils.md5DigestAsHex(password.getBytes()));
        user.setDesc(desc);

        return userMapper.saveUser(user);
    }
}
