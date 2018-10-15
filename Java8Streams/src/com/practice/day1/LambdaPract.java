package com.practice.day1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class LambdaPract {

	public static void main(String[] args) {
		
	//Consumer<String> c = (s) -> {System.out.println(s);};
	Consumer<String> c = System.out::println;	
		
	List<String> l = Arrays.asList("hi","hello");	
	
	l.forEach(c);
	
Predicate<Integer> p = (i) -> i > 18 ;

System.out.println(p.test(9));



	}

}
