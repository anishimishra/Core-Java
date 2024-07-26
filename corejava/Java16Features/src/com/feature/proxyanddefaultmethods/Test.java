package com.feature.proxyanddefaultmethods;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Test {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub
		Object proxy = Proxy.newProxyInstance(ClassLoader
				.getSystemClassLoader(), new Class<?>[] 
						{ Worker.class },
				(prox, method, arguments) -> {
					return InvocationHandler
							.invokeDefault(prox, method, 
									arguments);
				});
		Method method = proxy.getClass().getMethod("work");
		System.out.println(method.invoke(proxy));
	}

}
