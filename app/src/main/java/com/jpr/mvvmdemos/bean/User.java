package com.jpr.mvvmdemos.bean;

/**
 * 类描述:
 * 创建日期:2018/3/1 on 11:03
 * 作者:JiaoPeiRong
 */

public class User {
    private String name;
    private int age;
    private String img;

    public User(String name, int age , String img) {
        this.name = name;
        this.age = age;
        this.img = img;
    }

    /**
     * 属性必须添加getter,setter.否则DataBinding找不到该属性
     * @return
     */
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

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
