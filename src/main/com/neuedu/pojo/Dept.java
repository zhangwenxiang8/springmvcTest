package com.neuedu.pojo;

import org.springframework.stereotype.Controller;

import java.util.Arrays;

@Controller
public class Dept {
    private String pname;
    private String[] pass;

    public Dept() {
    }

    public Dept(String pname, String[] pass) {
        this.pname = pname;
        this.pass = pass;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String[] getPass() {
        return pass;
    }

    public void setPass(String[] pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "pname='" + pname + '\'' +
                ", pass=" + Arrays.toString(pass) +
                '}';
    }
}
