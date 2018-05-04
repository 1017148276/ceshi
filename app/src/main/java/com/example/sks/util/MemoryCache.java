package com.example.sks.util;

import android.graphics.Bitmap;
import android.util.LruCache;

/**
 * Created by sks on 2018/4/27.
 */

public class MemoryCache implements ImageCache {
    private LruCache<String,Bitmap> mMemeryCache;

    public MemoryCache(){
        //初始化LRU
    }
    @Override
    public Bitmap get(String url) {
        return mMemeryCache.get(url);
    }

    @Override
    public void put(String url, Bitmap bmp) {
         mMemeryCache.put(url,bmp);
    }
}
