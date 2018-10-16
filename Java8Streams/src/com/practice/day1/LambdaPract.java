package com.practice.day1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class LambdaPract {

	public static void main(String[] args) {

		// Consumer<String> c = (s) -> {System.out.println(s);};
		Consumer<String> c = System.out::println;
		Consumer<String> c1 = l -> System.out.println(l.length());
		List<String> l = Arrays.asList("hi", "hello");

		l.forEach(c.andThen(c1));

		Predicate<Integer> p = (i) -> i > 18;

		System.out.println(p.test(9));

	}

}
