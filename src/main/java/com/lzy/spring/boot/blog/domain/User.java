package com.lzy.spring.boot.blog.domain;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class User {

    private Long id;  //实体唯一标识
    private String name;
    private int age;

    public User( String name, String email) {
        this.name = name;
        this.age = age;
    }

    public User() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
