package com.example.sks.Lod;

/**
 * Created by sks on 2018/4/28.
 */

public class Room {
    public float area;
    public float price;
    public Room(float area,float price){
        this.area = area;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Roomn [area =" + area +", price = " + price +"]";
    }
}
