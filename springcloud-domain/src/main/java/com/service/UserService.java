package com.service;

import com.bean.User;

/**
 * Created by wangyong on 17-3-1.
 */
public interface UserService {

    User getUser(String userId);

    int saveUser(String userName, String password, String desc);
}
