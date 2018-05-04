package com.example.sks.annotation;

/**
 * Created by sks on 2018/4/11.
 */
@Annotation_my //使用我们刚才定义的注解
public interface Person {
    @Annotation_my
    public void name();

    @Annotation_my
    public void say();

    @Annotation_my
    public void age();
}
