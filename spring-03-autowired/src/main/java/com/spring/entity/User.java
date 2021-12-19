package com.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
/**
 * 场景：一个人有名字，身份证号，有一条狗，有一些爱好，默认没有老婆
 * */
public class User {
    private String name;
    private int id;
    private Dog dog;
    private List<String> hobbies;
    private Wife wife;
}
