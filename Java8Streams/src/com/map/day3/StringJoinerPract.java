package com.map.day3;

import java.util.StringJoiner;

public class StringJoinerPract {

	public static void main(String[] args) {
		
		StringJoiner sj = new StringJoiner(",");
		
		sj.add("hi");
		sj.add("hello");
		
		System.out.println(sj);
		

	}

}
