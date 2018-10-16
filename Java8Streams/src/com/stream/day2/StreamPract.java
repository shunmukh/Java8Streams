package com.stream.day2;

import java.util.Arrays;
import java.util.List;

public class StreamPract {

	public static void main(String[] args) {

		List<String> l = Arrays.asList("s", "h");

		l.stream().filter(s -> s.equals("s")).forEach(System.out::println);

		l.stream().map(s -> s.length()).forEach(System.out::println);

		List<List<String>> ls = Arrays.asList(l, l);

		ls.stream().filter(f -> f.size() < 0).flatMap(m -> m.stream()).forEach(System.out::println);
		;
		
		
		

	}

}
