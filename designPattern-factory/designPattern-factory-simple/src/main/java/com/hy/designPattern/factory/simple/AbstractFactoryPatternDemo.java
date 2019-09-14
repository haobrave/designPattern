package com.hy.designPattern.factory.simple;

public class AbstractFactoryPatternDemo {

	public static void main(String[] args) {
		 //获取形状工厂
	      AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
	      //获取形状为 Circle 的对象
	      Shape shape1 = shapeFactory.getShape("CIRCLE");
	      //调用 Circle 的 draw 方法
	      shape1.draw();
	}

}
