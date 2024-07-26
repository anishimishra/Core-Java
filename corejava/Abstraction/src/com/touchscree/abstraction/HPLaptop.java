package com.touchscree.abstraction;

public abstract class HPLaptop implements TouchScreenLaptop {

	@Override
	public void scroll() {
		// TODO Auto-generated method stub
		System.out.println("Scroll method from HPLaptop");
	}

	@Override
	public void click() {
		// TODO Auto-generated method stub
		System.out.println("Click method from HPLaptop");
	}

}
