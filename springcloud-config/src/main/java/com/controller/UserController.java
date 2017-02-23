package com.controller;

import com.bean.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wangyong on 17-2-23.
 */
@RestController
@RequestMapping("/user")
@Api("用户接口")
public class UserController {


    @ApiOperation(value = "获取用户信息", notes = "根据用户编号获取用户信息")
    @ApiImplicitParam(name = "userId", paramType = "path", value = "用户编号", required = true, dataType = "int")
    @GetMapping("/getUser/{userId}")
    public User getUser(@PathVariable int userId) {
        User user = new User();
        System.out.println("id:" + userId);
        user.setUserName("张三");
        return user;
    }
}
