package com.plugin.json;

import java.lang.annotation.*;

/**
 * Created by wangyong on 17-2-22.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(JSONS.class)
public @interface JSON {
    Class<?> type();
    String include() default "";
    String filter() default "";
}
