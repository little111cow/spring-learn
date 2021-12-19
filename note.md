# spring配置文件框架
```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       <!--注解约束-->
       xmlns:context="http://www.springframework.org/schema/context"
       <!--p命名空间依赖注入-->
       xmlns:p="http://www.springframework.org/schema/p"
       <!--c命名空间依赖注入-->
       xmlns:c="http://www.springframework.org/schema/c"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
        https://www.springframework.org/schema/beans/spring-beans.xsd">
        
        <!--开启注解支持-->
        <context:annotation-config/>
        <!--注解包扫描-->
        <context:component-scan base-package="com"/>


</beans>
```

# 常用maven依赖
```xml
<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-webmvc</artifactId>
    <version>5.3.12</version>
</dependency>
<!-- https://mvnrepository.com/artifact/junit/junit -->
<dependency>
    <groupId>junit</groupId>
    <artifactId>junit</artifactId>
    <version>4.13.1</version>
    <scope>test</scope>
</dependency>
<!-- https://mvnrepository.com/artifact/org.projectlombok/lombok -->
<dependency>
    <groupId>org.projectlombok</groupId>
    <artifactId>lombok</artifactId>
    <version>1.18.12</version>
</dependency>
<!-- https://mvnrepository.com/artifact/org.aspectj/aspectjweaver -->
        <dependency>
            <groupId>org.aspectj</groupId>
            <artifactId>aspectjweaver</artifactId>
            <version>1.9.6</version>
            <scope>runtime</scope>
        </dependency>
```

## 常用注解
注意：使用注解开发要保证AOP的包导入，使用配置文件需要添加Context约束，开启注解支持和包扫描
@Component 指明类为IOC容器组件，被Ioc容器托管
    @Repository Dao层的类
    @Service Service层的类
    @Controller Controller层类
以上几个注解作用一样，只不过针对不同的层
@Value(value="xxx") 给基本字段赋值
@Autowired  自动装配Bean
@Qualifier("user1") 多个不同名但类型一致时的自动装配
@Resource 自动装配Bean，相当于Autowired和Qualifier的组合，更强大

@Configuration 声明配置文件
@Bean 在Ioc容器注册一个Bean

