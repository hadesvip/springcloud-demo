package com.controller;

import com.bean.User;
import com.plugin.json.JSON;
import io.swagger.annotations.Api;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by wangyong on 17-2-21.
 */
//@RestController
@Controller
@Api("首页")
public class IndexController {

    @GetMapping("/")
    @JSON(type = User.class, include = "userName")
    public User index() {
        User user = new User();
        user.setUserName("admin");
        return user;
    }

}
