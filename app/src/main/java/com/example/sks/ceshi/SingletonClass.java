package com.example.sks.ceshi;

/**
 * Created by sks on 2017/12/12.
 * 单例
 */

public class SingletonClass {
    private static class LazyHolder {
        private static final SingletonClass INSTANCE = new SingletonClass();
    }
    private SingletonClass (){}
    public static final SingletonClass getInstance() {
        return LazyHolder.INSTANCE;
    }
}
