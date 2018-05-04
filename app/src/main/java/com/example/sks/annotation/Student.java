package com.example.sks.annotation;

/**
 * Created by sks on 2018/4/11.
 */
@Annotation_my
@SuppressWarnings("unused")
public class Student{
//    private String name;

//
    @Annotation_my(name="sbzz") //赋值给name  默认的为张三
////在定义注解时没有给定默认值时，在此处必须name赋初值
//    private String name;
    public void name() {

    }





    @Annotation_my(say=" hello world  ！")
    public void say() {

    }


    @Annotation_my(age=20)
    public void age() {

    }
}
