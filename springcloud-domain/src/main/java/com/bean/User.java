package com.bean;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Created by wangyong on 17-2-22.
 */
@NoArgsConstructor
@ToString
public class User {

    /**
     * 用户编号
     */
    private @Getter @Setter String userId;

    /**
     * 用户名
     */
    private @Getter @Setter String userName;

    /**
     * 用户密码
     */
    private @Getter @Setter String password;

    /**
     * 用户描述
     */
    private @Getter @Setter String desc;

}
