package com.hy.designPattern.factory.abstractClass;

public abstract class AbstactFactory {
	
	protected abstract Car getCar();
	
	public Car getCar(String name){
		if (CarType.BigCar.getCarType().equals(name)){
			return new BigCar();
		} else if(CarType.SmallCar.getCarType().equals(name)) {
			return new SmallCar();
		} else {
			return new SmallCar();
		}
	}

}
