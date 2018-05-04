package com.example.sks.util;

/**
 * 简历师徒抽象，测量视图的宽高为公用代，绘制实现交给具体的子类
 * Created by sks on 2018/4/27.
 */

public abstract class View {
    public abstract void draw();
    public void measure(int wedth,int height){
        //测量视图大小
    }

    public class Button extends View{

        @Override
        public void draw() {
            //绘制按钮
        }
    }

    public class TextView extends View{

        @Override
        public void draw() {
            //绘制文本
        }
    }
}


