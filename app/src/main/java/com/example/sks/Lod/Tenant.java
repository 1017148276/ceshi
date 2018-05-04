package com.example.sks.Lod;

import java.util.List;

/**
 * 租户 Github上传测试
 * Github上传测试
 * Github上传测试
 * Github上传测试
 * Created by sks on 2018/4/28.
 */

public class Tenant {
    public float roomArea;
    public float roomPrice;
    public static final  float diffPrice = 100.0001f;
    public static final  float diffArea = 0.0001f;

    public void rentRoom(Mediator mediator){

                System.out.print("租到房间了" + mediator.rentOut(roomArea,roomPrice));
    }


}
