package com.hy.designPattern.factory.method;

public class BigCarFactory implements Factory {

	public Car getCar() {
		return new BigCar();
	}

}
