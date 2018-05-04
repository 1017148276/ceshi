package com.example.sks.util;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.LruCache;
import android.widget.ImageView;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by sks on 2018/4/25.
 */

public interface ImageCache {

    public Bitmap get(String url);
    public void put(String url,Bitmap bmp);
//    //图片缓存
//    LruCache<String,Bitmap> mImageCache;
//
//
//    public ImageCache(){
//        initImageCache();
//    }
//    private void initImageCache(){
//        //计算可使用的最大内存
//        final  int maxMemory = (int) (Runtime.getRuntime().maxMemory() / 1024);
//        //取四分之一的可用内存作为缓存
//        final int cacheSize = maxMemory /4;
//
//        mImageCache = new LruCache<String,Bitmap>(cacheSize){
//            @Override
//            protected int sizeOf(String key, Bitmap bitmap) {
//                return bitmap.getRowBytes() * bitmap.getHeight() / 1024;
//            }
//        };
//    }
//
//
//    public void put(String url,Bitmap bitmap){
//        mImageCache.put(url,bitmap);
//    }
//
//    public Bitmap get(String url){
//        return mImageCache.get(url);
//    }


}
