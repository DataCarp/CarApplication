package com.example.main;

import com.example.java.model.Car;

import java.util.List;

public class CarTransaction {

	public int getSale(List<Car> cars) {

		int carCount = 0;
		for (Car c : cars) {
			carCount += c.sell();
		}

		return carCount;

	}

}
