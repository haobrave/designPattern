package com.hy.designPattern.factory.method;

public enum CarType {
	
	//枚举量
	SmallCar("SmallCar"),
	BigCar("BigCar");
	
	//成员变量
	private String carType;
	
	CarType(String carType){
		this.carType = carType;
	}
	
	public String getCarType(){
		return this.carType;
	}

}
