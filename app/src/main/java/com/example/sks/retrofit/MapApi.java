package com.example.sks.retrofit;


import com.google.gson.JsonObject;

import java.util.Map;

import retrofit2.http.Field;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Url;
import rx.Observable;

/**
 * Created by sks on 2017/8/3.
 */

public interface MapApi<T>{


    @FormUrlEncoded

    Observable<T> Post(@Url String zgs, @FieldMap Map<String, String> params);




//    tupian.aspx
//    @FormUrlEncoded
//    @POST("tupian.aspx")
//    //zgs 总公司 传入值直接返回 code 图片唯一码 liu base64编码 tname图片本地名称
//    Observable<Picture> uploadimage(
//            @Field("zgs") String zgs,
//            @Field("code") String code,
//            @Field("liu") String liu,
//            @Field("tpname") String tname,
//            @Field("type") String type
//
//    );
//
//
//
//    @FormUrlEncoded
//    @POST("shipin.aspx")
//        //zgs 总公司 传入值直接返回 code 图片唯一码 liu base64编码 tname图片本地名称
//    Observable<Picture> uploadivideo(
//            @Field("zgs") String zgs,
//            @Field("code") String code,
//            @Field("liu") String liu,
//            @Field("tpname") String tname,
//            @Field("type") String type
//
//    );
//
//
//    @FormUrlEncoded
//    @POST("xiaoxi.aspx")
//    Observable<PushMessage> pushmessage(
//            @Field("wa_nei_logo") String wa_nei_logo,
//            @Field("wa_nei_type") String wa_nei_type
//
//    );
//
//
//
//    @GET("update.aspx")
//    Observable<selectandroid> versionupdate(
//
//
//    );

}
