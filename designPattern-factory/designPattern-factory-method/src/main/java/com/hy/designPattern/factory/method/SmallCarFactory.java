package com.hy.designPattern.factory.method;

public class SmallCarFactory implements Factory {

	public Car getCar() {
		return new SmallCar();
	}

}
