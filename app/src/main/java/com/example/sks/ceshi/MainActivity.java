package com.example.sks.ceshi;


import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.BatteryManager;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.annotation.RequiresApi;
import android.support.v4.animation.ValueAnimatorCompat;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.sks.animator.Point;
import com.example.sks.animator.PointEvaluator;
import com.example.sks.annotation.studentname;
import com.example.sks.callback.CallBack;
import com.example.sks.util.DiskCache;
import com.example.sks.util.DoublCaChe;
import com.example.sks.util.ImageCache;
import com.example.sks.util.ImageLoader;
import com.example.sks.util.MemoryCache;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import rx.Observable;
import rx.Subscriber;
import rx.functions.Action1;

public class MainActivity extends AppCompatActivity implements CallBack {

    String result1;
    private IntentFilter intentFilter;
    private  NetworkChangeReceiver networkChangeReceiver;
    private boolean stopthread1 = true;
    @studentname(value = "default1")
    String onTestClick = "11";


    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button bt1 = (Button) findViewById(R.id.button);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                ValueAnimator animator = ValueAnimator.ofInt(0, 100);
//                animator.setDuration(300);
//                animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
//                    @Override
//                    public void onAnimationUpdate(ValueAnimator animation) {
//                        int currentValue =  (int)animation.getAnimatedValue();
//                        Log.d("sbzz", "cuurent value is " + currentValue);
//                    }
//                });
//
//                animator.start();
//                ObjectAnimator animator = ObjectAnimator.ofFloat(bt1, "rotationX", 0.0F, 360.0F);
//                animator.setDuration(5000);
//                animator.start();
//
//                ObjectAnimator animator = ObjectAnimator.ofFloat(bt1, "scaleY", 1f, 3f, 1f);
//
//
//                ObjectAnimator animator1 = ObjectAnimator.ofFloat(bt1, "scaleX", 1f, 3f, 1f);
//
//                ObjectAnimator moveIn = ObjectAnimator.ofFloat(bt1, "translationX", -500f, 0f);
//                AnimatorSet animSet = new AnimatorSet();
//                animSet.play(animator).after(animator1).after(moveIn);
//                animSet.setDuration(5000);
//                animSet.start();
//                ObjectAnimator moveIn = ObjectAnimator.ofFloat(bt1, "translationX", -500f, 0f);
//                ObjectAnimator rotate = ObjectAnimator.ofFloat(bt1, "rotation", 0f, 360f);
//                ObjectAnimator fadeInOut = ObjectAnimator.ofFloat(bt1, "alpha", 1f, 0f, 1f);
//                AnimatorSet animSet = new AnimatorSet();
//                animSet.play(rotate).with(fadeInOut).after(moveIn);
//                animSet.setDuration(5000);
//                animSet.start();

                ImageLoader imageLoader = new ImageLoader();
                imageLoader.setImageCache(new MemoryCache());
                imageLoader.setImageCache(new DiskCache());
                imageLoader.setImageCache(new DoublCaChe());
                imageLoader.setImageCache(new ImageCache() {
                    @Override
                    public Bitmap get(String url) {
                        return null;
                    }

                    @Override
                    public void put(String url, Bitmap bmp) {

                    }
                });
//
//                Animator animator = AnimatorInflater.loadAnimator(MainActivity.this, R.animator.cs);
//                animator.setTarget(v);
//
//                animator.addListener(new Animator.AnimatorListener() {
//                    @Override
//                    public void onAnimationStart(Animator animation) {
//                        Log.e("sbzz", "start" );
//                    }
//
//                    @Override
//                    public void onAnimationEnd(Animator animation) {
//                        Log.e("sbzz", "end" );
//                    }
//
//                    @Override
//                    public void onAnimationCancel(Animator animation) {
//                        Log.e("sbzz", "cancel" );
//                    }
//
//                    @Override
//                    public void onAnimationRepeat(Animator animation) {
//                        Log.e("sbzz", "repeat" );
//                    }
//                });
              //  animator.start();
            }
        });

     //   bt1.setOnClickListener(v ->  Observable.just("Hello, world!").subscribe(s -> Log.e("ssss","" + s )));
   //     bt1.setOnClickListener(v ->   Log.e("sssss","" + onTestClick));


//        bt1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Observable.just("Hello, world!").subscribe(s -> Log.e("ssss","" + s ));
//
//

     //   loadVlaue(studentname,value,value);




                //当前网络状态广播
//                Intent intent = new Intent("android.net.conn.CONNECTIVITY_CHANGE");
//                sendBroadcast(intent);
//                    intentFilter  = new IntentFilter();
//                    intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
//                    networkChangeReceiver = new NetworkChangeReceiver();
//                    registerReceiver( networkChangeReceiver, intentFilter);


                //系统电量广播

//                Intent batteryIntent = getApplicationContext().registerReceiver(null, new IntentFilter(Intent.ACTION_BATTERY_CHANGED));
//                int currLevel = batteryIntent.getIntExtra(BatteryManager.EXTRA_LEVEL, 0);
//                int total = batteryIntent.getIntExtra(BatteryManager.EXTRA_SCALE, 1);
//                int percent = currLevel * 100 / total;
//
//                Toast.makeText(MainActivity.this, String.valueOf(percent), Toast.LENGTH_SHORT).show();


//
//                MyThread myThread = new MyThread();
//                myThread.start();
////                if(stopthread1 == false){
////                    myThread.notifyAll();
////                }
//
//
//                MyThread1 myThread1 = new MyThread1();
//                myThread1.start();
//                MyThread2 myThread2 = new MyThread2();
//                MyThread3 myThread3 = new MyThread3();
//                MyThread4 myThread4 = new MyThread4();
////                myThread2.start();
////                myThread3.start();
////                myThread4.start();
//                synchronized(myThread2)
//                {
//                    try
//                    {
//
//                        myThread2.wait();//这一句是什么意思，究竟让谁wait?
//
//                    }catch (InterruptedException e){}
//                }
//                synchronized(myThread3)
//                {
//                    try
//                    {
//
//                        myThread3.wait();//这一句是什么意思，究竟让谁wait?
//
//                    }catch (InterruptedException e){}
//                }
//                synchronized(myThread4)
//                {
//                    try
//                    {
//
//                        myThread4.wait();//这一句是什么意思，究竟让谁wait?
//
//                    }catch (InterruptedException e){}
//                }
//


//                try {
//
//
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }



//                Log.e("ccc","" + 5/3);
//                Log.e("ccc","" + 5/3f);
//                Log.e("ccc","" + 5/3F);
//                Log.e("ccc","" + 5/3d);
//                Log.e("ccc","" + 5/3D);


//        String nae = "||8001|00*************21|消费 |2017-08-17|08:49:34|333|实收金额 ￥0.90|   圣和万家惠·万家都实惠\n" +
//                "|交易折扣率：0.90\n" +
//                "|交易金额：1.00|";
//
//                String[] temp = null;
//                temp = nae.split("\\|"); //截取字符串
//                for(int i =0; i<temp.length;i++ ){
//                   if(temp[0].equals("")){
//                       Log.e("Abs", "as" + temp[0]);
//                       break;
//                   }else{
//
//                   }
//
//                }
//                new hong().ceshi( new CallBack() {
//                    @Override
//                    public void solve(String result) {
//                        bt1.setText(result);
//                    }
//                });
//
//            }
//        });

    }



    @Override
    protected void onDestroy() {
        super.onDestroy();
     //   unregisterReceiver(networkChangeReceiver);
    }


    class  NetworkChangeReceiver extends BroadcastReceiver {

        @Override
        public void onReceive(Context context, Intent intent) {
            //Toast.makeText( context, "network changed", Toast.LENGTH_SHORT ).show();
            ConnectivityManager connectivityManager = (ConnectivityManager)getSystemService( Context.CONNECTIVITY_SERVICE);
            NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
            if( networkInfo != null && networkInfo.isAvailable() ){
                Toast.makeText( context, "广播可用", Toast.LENGTH_SHORT ).show();
            }else {
                Toast.makeText( context, "广播不可用", Toast.LENGTH_SHORT ).show();
            }

        }
    }




    /**
     * 读取注解值
     *
     * @param annotationClasss 处理Annotation类名称
     * @param annotationField 处理Annotation类属性名称
     * @param className 处理Annotation的使用类名称
     * @return
     * @throws Exception
     */
    @SuppressWarnings("all")
    public Map<String, String> loadVlaue(Class annotationClasss,
                                         String annotationField, String className) throws Exception {

        Map<String, String> map = new HashMap<String, String>();
        Method[] methods = Class.forName(className).getDeclaredMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(annotationClasss)) {
                Annotation p = method.getAnnotation(annotationClasss);
                Method m = p.getClass()
                        .getDeclaredMethod(annotationField, null);
                //这里根据属性参数类型进行强制类型转换
                String[] values = (String[]) m.invoke(p, null);
                for (String key : values) {

                    map.put(key, key);
                }
            }
        }

        return map;
    }

    /**
     * 数组间的复制
     */
    private void CopyArray() {
        int[] oldArray = new int[10];

        int[] newArray = new int[20];

        for (int i = 0; i < oldArray.length; i++) {
            newArray[i] = oldArray[i];
        }
        oldArray = newArray;
        Log.e("AbstractClass", "" + oldArray.length);
    }


    /**
     * 抽象方法测试
     */
    private void AbstractMethodTest() {

        new AbstractClass() {
            @Override
            public void sad() {
                Log.e("AbstractClass", "抽象方法的测试1");
            }
        }.fun();
    }

    /**
     * Double转String测试（解决Double转换中出现的精度丢失情况）
     */
    private void DoubletoStringTest() {
        String jine = String.valueOf(new BigDecimal(Double.parseDouble(String.valueOf(79.6)) * 100).setScale(0, BigDecimal.ROUND_HALF_UP));

        Log.e("jine", "" + jine);
    }


    @Override
    public void solve(String result) {
        result1 = result;
    }


//
//    private Object object = new Object();
//
//    private boolean stopthread2 = true;
//    private boolean stopthread3 = true;
//    private boolean stopthread4 = true;
//    private boolean stopthread5 = true;
//    int i = 0;
//    int i1 = 0;
//    int i2 = 0;
//    int i3 = 0;
//    int i4 = 0;
//    //  五个线程，12345,1开始执行，同事给2线程一个sleep(5000);,
//    // 345分别调用wait();,已知1线程执行8秒，2需要执行6秒，
//    // 3需要执行5秒，4需要执行3秒,5需要执行2秒，那么请问执行完这批人物总共需要几秒，
//    // 哪个线程最后执行完？
//    class MyThread extends Thread {
//        @Override
//        public void run() {
//
//            while (stopthread1) {
//                synchronized (MyThread.currentThread()){
////                    try {
////                        MyThread2.currentThread().wait();
////                        MyThread3.currentThread().wait();
////                        MyThread4.currentThread().wait();
////                    } catch (InterruptedException e) {
////                        e.printStackTrace();
////                    }
////                    try {
////                        MyThread3.currentThread().wait();
////                    } catch (InterruptedException e) {
////                        e.printStackTrace();
////                    }
//                    i++;
//                    Log.e("MyThread","" + i);
//                    if(i ==  8 ){
//                        stopthread1 = false;
//                        MyThread.currentThread().notifyAll();
////                        MyThread2.currentThread().start();
////                        MyThread3.currentThread().start();
////                        MyThread4.currentThread().start();
//                    }
//
//                }

//                new CountDownTimer(8000, 1000) {
//
//                    @Override
//                    public void onTick(long millisUntilFinished) {
//                    Log.e("MyThread","" + i );
//                        i++;
//                    }
//
//                    @Override
//                    public void onFinish() {
//                        stopthread1 = false;
//                        notifyAll();
//                    }
//                }.start();

//            }
//
//        }
//    }

//        class MyThread1 extends Thread {
//            @Override
//            public void run() {
//
//                synchronized (MyThread1.currentThread()){
//                    try {
//                        MyThread1.currentThread().sleep(5000);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    while (stopthread2) {
//
//                            i1++;
//                    Log.e("MyThread1","" + i1);
//                    if(i1 ==  6 ){
//                        stopthread2 = false;
//                    }}
//
////                while (stopthread2) {
////                    new CountDownTimer(6000, 1000) {
////
////                        @Override
////                        public void onTick(long millisUntilFinished) {
////                            Log.e("MyThread","" + i1);
////                            i1++;
////                        }
////
////                        @Override
////                        public void onFinish() {
////                            stopthread2 = false;
////
////                        }
////                    }.start();
////
//              }
//            }
//
//        }
//


//        class MyThread2 extends Thread {
//            @Override
//            public void run() {
//                synchronized (MyThread2.currentThread()){
////                    try {
////                        MyThread2.currentThread().wait();
////                    } catch (InterruptedException e) {
////                        e.printStackTrace();
////                    }
//                while (stopthread3) {
//
//                    i2++;
//                    Log.e("MyThread2", "" + i2);
//                    if (i2 == 5) {
//                        stopthread3 = false;
//
//
//                    }
//                }
////                    new CountDownTimer(5000, 1000) {
////
////                        @Override
////                        public void onTick(long millisUntilFinished) {
////                            Log.e("MyThread","" + i2 );
////                            i2++;
////                        }
////
////                        @Override
////                        public void onFinish() {
////                            stopthread3 = false;
////
////                        }
////                    }.start();
//
//                }
//
//            }
//        }
//
//
//
//        class MyThread3 extends Thread {
//            @Override
//            public void run() {
//                synchronized (MyThread3.currentThread()){
////                    try {
////                        MyThread3.currentThread().wait();
////                    } catch (InterruptedException e) {
////                        e.printStackTrace();
////                    }
//                while (stopthread4) {
//
//                    i3++;
//                    Log.e("MyThread3", "" + i3);
//                    if (i3 == 3) {
//                        stopthread4 = false;
//                    }
////                    new CountDownTimer(3000, 1000) {
////
////                        @Override
////                        public void onTick(long millisUntilFinished) {
////                            Log.e("MyThread","" + i3 );
////                            i3++;
////                        }
////
////                        @Override
////                        public void onFinish() {
////                            stopthread4 = false;
////
////                        }
////                    }.start();
//                }
//                }
//
//            }
//        }
//
//        class MyThread4 extends Thread {
//            @Override
//            public void run() {
//                synchronized (MyThread4.currentThread()){
////                    try {
////                        MyThread4.currentThread().wait();
////                    } catch (InterruptedException e) {
////                        e.printStackTrace();
////                    }
//                while (stopthread5) {
//                    i4++;
//                    Log.e("MyThread4", "" + i4);
//                    if (i4 == 2) {
//                        stopthread5 = false;
//                    }
//                }
////                    new CountDownTimer(2000, 1000) {
////
////                        @Override
////                        public void onTick(long millisUntilFinished) {
////                            Log.e("MyThread","" + i4 );
////                            i4++;
////                        }
////
////                        @Override
////                        public void onFinish() {
////                            stopthread5 = false;
////
////                        }
////                    }.start();
//
//                }
//            }
//        }




}
