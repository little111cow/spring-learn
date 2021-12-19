package com.spring.log;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * aop实现方法三：注解实现aop
 * */
@Aspect //将类标注为一个切面
public class AnnotationAop {

    @Before("execution(* com.spring.service.UserServiceImpl.*(..))")//定义切入点和执行前执行
    public void before(){
        System.out.println("注解方法执行前");
    }

    @After("execution(* com.spring.service.UserServiceImpl.*(..))")
    public void after(){
        System.out.println("注解方法执行后");
    }
    @Around("execution(* com.spring.service.UserServiceImpl.*(..))")
//    连接点执行时自动生成，可以直接获取使用
    public void around(ProceedingJoinPoint jp)throws Throwable{
        System.out.println("环绕前");
        jp.getSignature();
        Object res = jp.proceed();  //调用来执行方法
        System.out.println("环绕后");
    }
//    @AfterReturning("execution(* com.spring.service.UserServiceImpl.*(..))")
//    @AfterThrowing("execution(* com.spring.service.UserServiceImpl.*(..))")
}
