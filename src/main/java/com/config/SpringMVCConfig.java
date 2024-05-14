package com.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.controller")
public class SpringMVCConfig {
    /**
     * 1.@Configuration 定义SpringMVCConfig.xml配置文件
     * 2.将控制类注入到ioc容器 @ComponentScan("com.controller")
     * @ComponentScan("com.controller")将该包下的所有类 注入到IOC容器中
     * 3.springmvc原理 所有请求过来先到达 DispatcherServlet 再分发到具体控制类方法执行
     */
}
