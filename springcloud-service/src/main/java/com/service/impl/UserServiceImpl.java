package com.service.impl;

import com.bean.User;
import com.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Map;

/**
 * Created by wangyong on 17-3-1.
 */
@Service
public class UserServiceImpl implements UserService {

 /*   @Autowired
    private UserMapper userMapper;*/

    @Transactional(readOnly = true)
    @Override
    public User getUser(Map<String, Object> params) {

        return null;
    }
}
