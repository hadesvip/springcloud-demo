package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wangyong on 17-2-21.
 */
@RestController
public class IndexController {

    @GetMapping("/")
    public String index() {

        return "hello,springcloud-config.";
    }
}
