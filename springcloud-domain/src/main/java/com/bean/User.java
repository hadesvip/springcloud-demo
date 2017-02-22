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

    private @Getter @Setter String userName;

    private @Getter @Setter String password;

}
