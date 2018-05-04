package com.example.sks.util;

import android.graphics.Bitmap;
import android.provider.ContactsContract;

/**
 * 双缓存，获取图片是先从内存缓存中获取，如果内存中没有缓存该图片，再从SD卡中获取
 * 缓存图片也是在内存和SD卡中都缓存一份
 * Created by sks on 2018/4/26.
 */

public class DoublCaChe implements ImageCache{
    ImageCache mMemoryCache = new MemoryCache();
    ImageCache mDiskCache = new DiskCache();
    @Override
    public Bitmap get(String url) {
        Bitmap bitmap = mMemoryCache.get(url);
        if(bitmap == null){
            bitmap = mDiskCache.get(url);
        }
        return bitmap;
    }

    @Override
    public void put(String url, Bitmap bmp) {
        mMemoryCache.put(url,bmp);
        mDiskCache.put(url, bmp);
    }
//    ImageCache mMemoryCache = new ImageCache();
//    DiskCache mDiskCache = new DiskCache();
//
//
//    //先从内存缓存中获取图片，如果没有，再从SD卡中读取
//
//    public Bitmap get(String url){
//        Bitmap bitmap = mMemoryCache.get(url);
//        if(bitmap == null){
//         bitmap = mDiskCache.get(url);
//        }
//        return bitmap;
//    }
//
//    //将图片缓存到内存和SD卡中
//    public void put (String url,Bitmap bmp){
//        mMemoryCache.put(url, bmp);
//        mDiskCache.put(url, bmp);
//    }

}
