package com;

import org.springframework.util.DigestUtils;

/**
 * Created by wangyong on 17-3-2.
 */
public class Console {

    public static void main(String[] args) {
        String str = DigestUtils.md5DigestAsHex("123456".getBytes());


        System.out.println(str);
    }
}
