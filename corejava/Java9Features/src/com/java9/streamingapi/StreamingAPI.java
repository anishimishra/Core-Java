package com.java9.streamingapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamingAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(10, 40, 7, 18, 30, 23, null);
		// System.out.println(list.stream()
		// .filter(x -> x % 5 == 0)
		// .colect(Collectors.toList()));
		System.out.println(list.stream()
				.takeWhile(x -> x % 5 == 0)
				.collect(Collectors.toList()));
		System.out.println(list.stream()
				.dropWhile(x -> x % 5 == 0)
				.collect(Collectors.toList()));
		System.out.println(list.stream()
				.flatMap(k -> Stream.ofNullable(k))
				.collect(Collectors.toList()));
	}
}