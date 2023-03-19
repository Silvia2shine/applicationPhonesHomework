package org.example;

public class SamsungGalaxyS22 extends Samsung{
    String  color;
    String material;
    Double imei;

    SamsungGalaxyS22(Integer batteryLife,String color,  String material, Double imei) {
        super(batteryLife);
        this.color = color;
        this.material = material;
        this.imei = imei;
    }


}
