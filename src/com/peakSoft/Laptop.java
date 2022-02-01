package com.peakSoft;

public class Laptop {
    String modelName;
    double monitorSize;
    String processor;
    double installedRam;
    byte systemType;
    String operatingSystem;

    void turnOn() {
        System.out.println(modelName + " is turn on");
        boolean turnOn = true;
    }

    void turnOff() {
        System.out.println(modelName + " is turn off");
        boolean turnOff = false;
    }
}
