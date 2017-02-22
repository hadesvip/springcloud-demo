package com.config;

import com.plugin.json.JsonReturnHandler;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.method.support.HandlerMethodReturnValueHandler;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.List;

/**
 * springMVC配置
 * Created by wangyong on 17-2-22.
 */
@Configuration
public class MVConfig extends WebMvcConfigurerAdapter {


    @Override
    public void addReturnValueHandlers(List<HandlerMethodReturnValueHandler> returnValueHandlers) {
        returnValueHandlers.add(new JsonReturnHandler());
        super.addReturnValueHandlers(returnValueHandlers);
    }
}
