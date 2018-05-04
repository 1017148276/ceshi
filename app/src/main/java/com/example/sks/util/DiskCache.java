package com.example.sks.util;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * SD卡缓存DiskCache类
 * Created by sks on 2018/4/26.
 */

public class DiskCache implements ImageCache {
    @Override
    public Bitmap get(String url) {
        return null;//从本地文件中获取该图片
    }

    @Override
    public void put(String url, Bitmap bmp) {
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream( url);
            bmp.compress(Bitmap.CompressFormat.PNG,100,fileOutputStream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
           CloseUtils.closeQuietly(fileOutputStream);
        }
    }
//    static String cacheDir = "sdcard/cache";
//    //从缓存中获取图片
//    public Bitmap get(String url){
//        return BitmapFactory.decodeFile(cacheDir + url);
//    }
//    //将图片缓存到内存中
//    public void put(String url,  Bitmap bmp){
//        FileOutputStream fileOutputStream = null;
//        try {
//            fileOutputStream = new FileOutputStream(cacheDir + url);
//            bmp.compress(Bitmap.CompressFormat.PNG,100,fileOutputStream);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }finally {
//            if(fileOutputStream != null){
//                try {
//                    fileOutputStream.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//    }
}
