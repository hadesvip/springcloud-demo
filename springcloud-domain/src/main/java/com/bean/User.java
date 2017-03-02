package com.bean;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@ToString
public class User {
    private @Getter @Setter String userId;

    private @Getter @Setter String userName;

    private @Getter @Setter String password;

    private @Getter @Setter String desc;


}