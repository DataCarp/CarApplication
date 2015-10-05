package com.example.main;

import com.example.java.model.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Car> cars = new ArrayList<>();
        cars.add(new Ford());
        cars.add(new Ford());
        cars.add(new Chevy());
        cars.add(new Chevy());
        cars.add(new Chevy());
        cars.add(new Ford());

        CarTransaction sell = new CarTransaction();
        int carCount = sell.getSale(cars);

        System.out.println("Combined, these cars can seat " + carCount + " total passengers");

    }

}
