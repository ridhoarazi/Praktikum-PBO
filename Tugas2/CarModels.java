package models;

import car.Car;

public class CarModels {
    public static void main(String[] args) {
        Car Car1 = new Car();
        System.out.println("Default Car Brand: " + Car1.brand);
        System.out.println("Default Car Color: " + Car1.color);
        Car1.startEngine();
        Car1.throttle();
        Car1.turnOnHeadLamp();

        System.out.println();

        Car Car2 = new Car("Lght Blue", "D 111 ABC", 2.0, 1.6, "Pagani");
        System.out.println("My Car Brand: " + Car2.brand);
        System.out.println("My Car Color: " + Car2.color);
        System.out.println("My Car Plate: " + Car2.noPlate);

        Car2.startEngine();
        Car2.brake();
        Car2.turnOffHeadLamp();
    }
}
