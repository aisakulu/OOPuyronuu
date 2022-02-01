package com.peakSoft;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Laptop lenovo = new Laptop();

        lenovo.modelName = "Lenovo";
        lenovo.monitorSize = 15.5;
        lenovo.processor = "i5";
        lenovo.installedRam = 8.0;
        lenovo.systemType = 64;
        lenovo.operatingSystem = "Windows 11";

       lenovo.turnOn();
       lenovo.turnOff();

    }
}
