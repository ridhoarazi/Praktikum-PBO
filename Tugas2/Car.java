package car;

import Interfaces.CarInterfaces;

public class Car implements CarInterfaces {
    public String color;
    public String noPlate;
    public double width;
    public double height;
    public String brand;

    public Car() {
        color = "Black";
        noPlate = "B 1234 XYZ";
        width = 1.8;
        height = 1.5;
        brand = "Toyota";
    }

    public Car(String c, String n, double w, double h, String b) {
        color = c;
        noPlate = n;
        width = w;
        height = h;
        brand = b;
    }

    public void startEngine() {
        System.out.println(brand + " engine started.");
    }

    public void throttle() {
        System.out.println(brand + " is accelerating...");
    }

    public void brake() {
        System.out.println(brand + " is braking.");
    }

    public void turnOnHeadLamp() {
        System.out.println("Headlamp is ON.");
    }

    public void turnOffHeadLamp() {
        System.out.println("Headlamp is OFF.");
    }
}
