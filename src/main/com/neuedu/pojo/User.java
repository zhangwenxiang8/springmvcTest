package com.neuedu.pojo;

import lombok.Data;
import org.springframework.stereotype.Controller;


@Controller
public class User {
    private Integer id;
    private String name;
    private String pwd;
    private Dept dept;

    public User() {
    }

    public User(Integer id, String name, String pwd, Dept dept) {
        this.id = id;
        this.name = name;
        this.pwd = pwd;
        this.dept = dept;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                ", dept=" + dept +
                '}';
    }
}
