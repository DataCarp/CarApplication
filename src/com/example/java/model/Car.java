package com.example.java.model;

public class Car {

    private CarName name;
    private CarColor color;
    private int passengerCount;

    public Car(CarName name, CarColor color, int passengerCount) {
        this.name = name;
        this.color = color;
        this.passengerCount = passengerCount;
    }

    public CarName getName() {
        return name;
    }

    public void setName(CarName name) {
        this.name = name;
    }

    public CarColor getColor() {
        return color;
    }

    public void setColor(CarColor color) {
        this.color = color;
    }

    public int sell() {
        System.out.println(name + ": " + passengerCount + " passengers");
        return passengerCount;
    }

    public void setPassengerCount(int passengerCount) {
        this.passengerCount = passengerCount;
    }

    @Override
    public String toString() {
        return name.toString();
    }

}
