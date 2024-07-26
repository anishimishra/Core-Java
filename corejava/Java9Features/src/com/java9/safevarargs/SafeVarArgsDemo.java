package com.java9.safevarargs;

import java.util.Arrays;
import java.util.List;

public class SafeVarArgsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> l1 = Arrays.asList("abc", "xyz");
		List<String> l2 = Arrays.asList("nyc", "lon");
		SafeVarArgsDemo.myMethod(l1, l2);
		SafeVarArgsDemo sva = new SafeVarArgsDemo();
		sva.myMethod2(l1, l2);
	}

	@SafeVarargs
	public static void myMethod(List<String>... l) {// List<String>[]

		/*
		 * Object[] objects = l; 
		 * Objects[0]=Arrays.asList(1,2); 
		 * String name=(String)
		 * l[0].get(0); System.out.println(name);
		 */
		String name = (String) l[0].get(0);
		System.out.println(name);
	}

	@SafeVarargs
	private void myMethod2(List<String>... l) {
		String name = (String) l[0].get(0);
		System.out.println(name);
	}
}
