package com.spring.config;

import com.spring.entity.Dog;
import com.spring.entity.Wife;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.spring")
public class myConfig1 {
    @Bean
    public Dog dog(){
        return new Dog();
    }

    @Bean
    public Wife wife(){
        return new Wife();
    }
}
