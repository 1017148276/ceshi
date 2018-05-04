package com.example.sks.ceshi;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

import java.util.concurrent.BrokenBarrierException;

/**
 * Created by sks on 2018/3/28.
 */

public class MyBroadcastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "接收到广播", Toast.LENGTH_SHORT).show();
    }
}
