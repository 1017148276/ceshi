package com.example.sks.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.BatteryManager;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by sks on 2018/3/30.
 */

public class BatteryChangedReceiver extends BroadcastReceiver{
    @Override
    public void onReceive(Context context, Intent intent) {
        // 当前电量
        int currLevel = intent.getIntExtra(BatteryManager.EXTRA_LEVEL, 0);
        // 总电量
        int total = intent.getIntExtra(BatteryManager.EXTRA_SCALE, 1);
        int percent = currLevel * 100 / total;
        Toast.makeText(context, percent, Toast.LENGTH_SHORT).show();





    }
}
