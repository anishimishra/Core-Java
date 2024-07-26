package com.ani.java.reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class TestCalculator {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println(Class.forName(Calculator.class.getName()));
			Class myClass = Class.forName(Calculator.class.getName());
			System.out.println(myClass.getName());
			Constructor[] constructors = myClass.getConstructors();
			System.out.println(Arrays.toString(constructors)); // private constructors are not listed
			System.out.println(Arrays.toString(myClass.getMethods()));

			Constructor constructor = myClass.getConstructor(null);
			System.out.println(constructor.newInstance(null));

			Constructor constructor2 = myClass.getConstructor(double.class, double.class);
			System.out.println(constructor2.newInstance(5, 10));
			Object myObj = constructor2.newInstance(5, 10);

			Method setNum1 = myClass.getMethod("setNum1", double.class);
			setNum1.invoke(myObj, 6);

			Method setNum2 = myClass.getMethod("setNum2", double.class);
			setNum2.invoke(myObj, 8);

			Field num1Field = myClass.getDeclaredField("num1");
			num1Field.setAccessible(true);
			num1Field.set(myObj, 80);

			Method getNum1 = myClass.getMethod("getNum1", null);
			System.out.println(getNum1.invoke(myObj, null));

			Method getNum2 = myClass.getMethod("getNum2", null);
			System.out.println(getNum2.invoke(myObj, null));

			Method sum = myClass.getMethod("sum", int.class, int.class);
			System.out.println(sum.invoke(myObj, 4, 5));

			Annotation[] annotations = myClass.getAnnotations();
			// getNum1.getAnnotations();
			// num1Field.getAnnotations();
			System.out.println(annotations);
			System.out.println(Arrays.toString(annotations));

			MyAnnotation annotation = (MyAnnotation) annotations[0];
			System.out.println(annotation.value1());
			System.out.println(annotation.value2());

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
