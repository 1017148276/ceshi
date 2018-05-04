package com.example.sks.ceshi;

import android.content.Context;

import java.util.Random;

/**
 * Created by sks on 2017/12/12.
 * 线程锁
 */

public class LockClass {
    Random random=new Random();
    private void  SynchronizationLock(Context context){

        synchronized (context){
          for(int i = 0;i < 10;i ++ ){
            random.nextInt(10);
          }
        }
    }


}
