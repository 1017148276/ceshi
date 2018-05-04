package com.example.sks.util;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.LruCache;
import android.widget.ImageView;

import java.io.IOException;
import java.net.HttpCookie;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import retrofit2.http.Url;

/**
 * Created by sks on 2018/4/25.
 */

public class ImageLoader {
    DoublCaChe mCache = new DoublCaChe();
//    //图片缓存
//    ImageCache mImageCache= new ImageCache() {
//        @Override
//        public Bitmap get(String url) {
//            return null;
//        }
//
//        @Override
//        public void put(String url, Bitmap bmp) {
//
//        }
//    };
//    //SD卡缓存
//    DiskCache mDiskCache = new DiskCache();
//    //双缓存
//    DoublCaChe mDoublCaChe  = new DoublCaChe();
//    //是否使用SD卡缓存
//    boolean isUseDiskCache = false;
//    //是否使用双缓存
//    boolean isUseDoubleCache = false;

    //线程池，现场呢个数量为cpu数量
    ExecutorService mExecutorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());


    //注入缓存实现
    public void setImageCache(ImageCache cache){
        mCache = (DoublCaChe) cache;
    }


  //加载图片
    public void displayImage(final String imageUrl, final ImageView imageView) {
       Bitmap bitmap = mCache.get(imageUrl);
        if(bitmap == null){
           downloadImage(imageUrl);
        }else{
            imageView.setImageBitmap(bitmap);
        }



        //没有缓存，则提交给线程池进行下载
    }
     private void submitLoadRequest(final String imageUrl,final ImageView imageView){
         imageView.setTag(imageUrl);
         mExecutorService.submit(new Runnable() {
             @Override
             public void run() {
                 Bitmap bitmap = downloadImage(imageUrl);
                 if(bitmap == null){
                     return;
                 }
                 if(imageView.getTag().equals(imageUrl)){
                     imageView.setImageBitmap(bitmap);
                 }
                 mCache.put(imageUrl,bitmap);
             }
         });


     }
     public Bitmap downloadImage(String imageUrl){
         Bitmap bitmap = null;
         try {
             URL url = new URL(imageUrl);
             final HttpURLConnection conn = (HttpURLConnection) url.openConnection();
             bitmap = BitmapFactory.decodeStream(conn.getInputStream());
             conn.disconnect();
         } catch (MalformedURLException e) {
             e.printStackTrace();
         }
         return bitmap;
     }

//    public void  useDiskCache(boolean useDiskCache){
//        isUseDiskCache = useDiskCache;
//    }
//
//    public void useDoubleCache(boolean useDoubleCache){
//        isUseDoubleCache = useDoubleCache;
//    }


    public Bitmap downloadImage(String imageurl){
        Bitmap bitmap = null;
        try {
            URL url = new URL(imageurl);
            final HttpURLConnection conn = (HttpURLConnection)url.openConnection();
            bitmap = BitmapFactory.decodeStream(conn.getInputStream());
            conn.disconnect();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return bitmap;
    }



}
