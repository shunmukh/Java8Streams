package com.map.day3;

import java.util.HashMap;
import java.util.Map;

public class MapPract {

	public static void main(String[] args) {
		
		
		Map<String,String> m = new HashMap<String,String>();
		m.put("1", "hi");
		m.put("2", "hello");
		
		System.out.println(m.getOrDefault("1", "Empty"));
		
		System.out.println(m.remove("1", "hi"));

		System.out.println(m.putIfAbsent("1","Hi"));
		
		System.out.println(m.compute("1", (k,v) -> k + v) ); // computes the function if value is present
		
		System.out.println(m.computeIfAbsent("3", (k) -> "6"));
		
		System.out.println(m.merge("1", "Hello", (v,s) -> v+s)); // This can be used for createing bimaps like Map<String,Map<String,List<MAp>>>
		
		System.out.println(m);
		
		

	}

}
