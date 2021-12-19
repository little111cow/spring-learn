package com.spring.log;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class BeforeLog implements MethodBeforeAdvice {
    public void before(Method method,Object[] args,Object Target){
        System.out.println(Target.getClass().getName()+"类的"+method.getName()+"方法被执行了！");
    }
}
