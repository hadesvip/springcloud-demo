package com.controller;

import com.bean.User;
import com.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by wangyong on 17-2-23.
 */
@RestController
@RequestMapping("/user")
@Api("用户接口")
public class UserController {

    @Autowired
    private UserService userService;

    @ApiOperation(value = "获取用户信息", notes = "根据用户编号获取用户信息")
    @ApiImplicitParam(name = "userId", paramType = "path", value = "用户编号", required = true, dataType = "int")
    @GetMapping("/getUser/{userId}")
    public User getUser(@PathVariable int userId) {
        User user = new User();
        System.out.println("id:" + userId);
        user.setUserName("张三");
        return user;
    }

    @ApiOperation(value = "打招呼", notes = "简单的打招呼")
    @ApiImplicitParam(name = "userName", paramType = "path", value = "用户名", required = true, dataType = "String")
    @PostMapping("/hello/{userName}")
    public String hello(@PathVariable String userName) {

        userService.saveUser("张三", "123456", "普通用户");
        return "hello," + userName;
    }


}
