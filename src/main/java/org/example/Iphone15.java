package org.example;

public class Iphone15 extends IPhone{
    String color;
    String material;
    Double imei;
    Iphone15(Integer batteryLife,String color, String material, Double imei) {
        super(batteryLife);
        this.color = color;
        this.material = material;
        this.imei = imei;
    }
}
