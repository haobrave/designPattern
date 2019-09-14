package com.hy.designPattern.factory.abstractClass;

public class DefaultFactory extends AbstactFactory {

	private AudiFactory abstactFactory = new AbstactFactory();
	@Override
	protected Car getCar() {
		return null;
	}

}
