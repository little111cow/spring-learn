package com.spring;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**抽取的动态代理处理程序工具类*/
public class ProxyInvacationHandler implements InvocationHandler {
    /*被代理的角色*/
    private Object Target;

    public void setTarget(Object target) {
        Target = target;
    }
    //获得代理类实列
    public Object getProxy(){
        //需要三个参数：类加载器，接口对象，代理处理程序类就是this对象
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),Target.getClass().getInterfaces(),this);
    }
    //代理相应的方法，可以在这个方法中进行业务扩展
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(Target,args);
        return result;
    }
}
