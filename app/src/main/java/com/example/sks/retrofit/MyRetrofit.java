 package com.example.sks.retrofit;


import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;


 public class MyRetrofit {

     private static Retrofit retrofit;


     public static Retrofit getInstance() {
         if (retrofit == null) {
             OkHttpClient client = new OkHttpClient();
         //    http://192.168.1.176/jiekou/
//             http://www.xzhp.net/wani/jiekou/
             retrofit = new Retrofit.Builder().client(client)
                     .baseUrl("jiekou/")
                     .addConverterFactory(GsonConverterFactory.create())
                     .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                     .build();
         }
         return retrofit;
     }
 }
