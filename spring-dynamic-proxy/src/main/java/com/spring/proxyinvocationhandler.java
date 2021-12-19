package com.spring;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//invocation动态代理处理程序，可以实现增加业务的同时不改变原有的业务代码，实现解耦
//作用1.获得代理实列2.动态调用方法
public class proxyinvocationhandler implements InvocationHandler {

    //被代理的接口
    private Rent rent;

    //set方法一定要有
    public void setRent(Rent rent) {
        this.rent = rent;
    }

    //获得代理实列
    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),rent.getClass().getInterfaces(),this);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        log(method);
        Object result = method.invoke(rent,args);  //动态调用方法
        fare();
        return result;
    }

    public void log(Method method){
        System.out.println("执行了"+method.getName()+"方法！");
    }

    public void fare(){
        System.out.println("代理收中介费");
    }
}
