package org.example;

public class SamsungGalaxy6 extends Samsung{
    String  color;
    String material;
    Double imei;

    public SamsungGalaxy6 (Integer batteryLife, String color,  String material, Double imei){
        super(batteryLife);
        this.color = color;
        this.material = material;
        this.imei = imei;

    }

//    @Override
//    public void getMessage(String phoneNumber) {
//
//        return null;
//    }
}

