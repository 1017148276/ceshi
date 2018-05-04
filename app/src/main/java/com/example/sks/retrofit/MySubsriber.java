package com.example.sks.retrofit;

import retrofit2.adapter.rxjava.HttpException;
import rx.Subscriber;

/**
 * Created by sks on 2017/8/3.
 * Retrofit请求数据对网络异常的处理
 */
public class MySubsriber<T> extends Subscriber<T> {
    private static final String TAG = "MySubsriber";
    private ApiCallback<T> apiCallback;

    public MySubsriber(ApiCallback<T> apiCallback) {
        this.apiCallback = apiCallback;
    }

    @Override
    public void onCompleted() {
        apiCallback.onCompleted();
    }

    @Override
    public void onError(Throwable e) {
        e.printStackTrace();
        if (e instanceof HttpException) {
            HttpException httpException = (HttpException) e;
            //httpException.response().errorBody().string()
            int code = httpException.code();
            String msg = httpException.getMessage();
            if (code == 504) {
                msg = "网络不给力";
            }
            apiCallback.onFailure(code, msg);
        } else {
            apiCallback.onFailure(0, e.getMessage());
        }
        apiCallback.onCompleted();
    }

    @Override
    public void onNext(T t) {
        apiCallback.onSuccess(t);
    }
}
