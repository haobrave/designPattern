package com.hy.designPattern.factory.method;

public class Test {

	public static void main(String[] args) {
		Factory factory = new BigCarFactory();
		System.out.println(factory.getCar().getName());
		
		Factory factory1 = new SmallCarFactory();
		System.out.println(factory1.getCar().getName());

	}

}
