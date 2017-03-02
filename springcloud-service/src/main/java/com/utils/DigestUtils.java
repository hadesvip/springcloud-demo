package com.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by wangyong on 17-3-2.
 */
public class DigestUtils {

    /**
     * md5加密
     *
     * @param str
     * @return
     * @throws NoSuchAlgorithmException
     */
    public static String getMd5(String str) throws NoSuchAlgorithmException {
        MessageDigest md5 = MessageDigest.getInstance("MD5");
        return md5.digest(str.getBytes()).toString();
    }
}
