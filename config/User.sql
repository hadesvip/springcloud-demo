use mydb;
CREATE TABLE `user`(
    `user_id` VARCHAR (40) NOT NULL  COMMENT '用户编号',
    `user_name` VARCHAR (20) NOT NULL DEFAULT '' COMMENT '用户名',
    `password` VARCHAR (40) NOT NULL DEFAULT '' COMMENT '密码',
    `desc` VARCHAR (100) NOT NULL DEFAULT '' COMMENT '描述',
    PRIMARY KEY (`user_id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT '`用户表`';
