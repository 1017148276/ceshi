package com.example.sks.util;

import java.io.Closeable;
import java.io.IOException;

/**
 * Created by sks on 2018/4/27.
 */

public class CloseUtils {
    private CloseUtils(){

    }

    public static void closeQuietly(Closeable closeable){
        if(null != closeable){
            try {
                closeable.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }



}
