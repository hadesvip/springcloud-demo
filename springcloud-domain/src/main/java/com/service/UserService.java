package com.service;

import com.bean.User;

import java.util.Map;

/**
 * Created by wangyong on 17-3-1.
 */
public interface UserService {

    User getUser(Map<String, Object> params);
}
