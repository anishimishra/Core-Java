package com.feature.proxyanddefaultmethods;

public interface Worker {
	public default String work() {
		return "Done";
	}
}
