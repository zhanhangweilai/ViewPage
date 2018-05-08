package com.example.lh.viewpagerdemo;

import java.io.Serializable;

/**
 * Created by lihang on 18-4-25.
 */

public class MySerializable implements Serializable {
    private int age;
    //private static final long serialVersionUID = 68556980L;
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "age="+age;
    }
}
