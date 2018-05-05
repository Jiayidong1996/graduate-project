package com.graduate.project.entity;

import java.util.Date;

public class UserInfo {
    private Long id;

    private String username;

    private Date birthday;

    private Double height;

    private Boolean sex;

    private Integer age;

    private Integer ifMarried;

    private Integer education;

    private String position;

    public UserInfo(Long id, String username, Date birthday, Double height, Boolean sex, Integer age, Integer ifMarried, Integer education, String position) {
        this.id = id;
        this.username = username;
        this.birthday = birthday;
        this.height = height;
        this.sex = sex;
        this.age = age;
        this.ifMarried = ifMarried;
        this.education = education;
        this.position = position;
    }

    public UserInfo() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getIfMarried() {
        return ifMarried;
    }

    public void setIfMarried(Integer ifMarried) {
        this.ifMarried = ifMarried;
    }

    public Integer getEducation() {
        return education;
    }

    public void setEducation(Integer education) {
        this.education = education;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }
}