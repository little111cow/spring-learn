package com.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
/**
 * 场景：一个人有名字，身份证号，有一条狗，有一些爱好，默认没有老婆
 * */
@Component
@Scope("singleton")  //Bean的作用域，默认为单列
public class User {
    @Value("haha")
    private String name;
    @Value("123")
    private int id;
    @Autowired  //自动装配Bean
    @Qualifier(value = "dog")
//    或者@Resource
    private Dog dog;
    @Value("打球,听音乐,打游戏")
    private List<String> hobbies;
//    @Autowired
    @Resource
    private Wife wife;
}
