package com.spring.config;

import com.spring.entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * 作用和xml配置文件的作用一致，只不过使用java代码实现配置
 *
 * */
@Configuration  //次注解作用是声明一个IOC容器，和xml作用一致
@ComponentScan(basePackages = "com.spring")  //注解起作用的包
@Import(myConfig1.class)  //导入融合其它配置文件，和xml文件import标签作用一致
public class myConfig {
    @Bean  //指明托管的类，返回值为对应的类，方法名对应名称，在程序中取时的名字
    public User user(){
        return new User();
    }
}
