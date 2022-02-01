package com.peakSoft;

public class Person {

    String name;
    String lastName;
    byte age;
    double height;
    double weight;
    char gender;
    String color;
    String nationality;
    String status;
    boolean education;

    public void run() {
        System.out.println(this.name + " running");
    }

    public void speak() {
        System.out.println(name + " " + lastName + " is speaking");
    }

}
