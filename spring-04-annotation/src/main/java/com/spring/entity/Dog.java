package com.spring.entity;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@ToString
public class Dog {
    @Value("red")  //依赖注入,自动赋值
    private String color;

    public void shout(){
        System.out.println("wangwangwang~~");
    }
}
