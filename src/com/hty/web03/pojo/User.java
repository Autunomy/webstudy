package com.hty.web03.pojo;

public class User {
    private String name;
    private Integer age;
    private String sex;
    private String[] loves;
    private String city;

    public User() {
    }

    public User(String name, Integer age, String sex, String[] loves, String city) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.loves = loves;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String[] getLoves() {
        return loves;
    }

    public void setLoves(String[] loves) {
        this.loves = loves;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
