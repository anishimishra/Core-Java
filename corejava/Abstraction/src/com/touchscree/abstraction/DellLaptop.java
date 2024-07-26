package com.touchscree.abstraction;

public abstract class DellLaptop implements TouchScreenLaptop {

	@Override
	public void scroll() {
		// TODO Auto-generated method stub
		System.out.println("Scroll method from DellLaptop");
	}

	@Override
	public void click() {
		// TODO Auto-generated method stub
		System.out.println("Click method from DellLaptop");
	}

}
