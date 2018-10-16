package com.stream.day2;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamPract {

	public static void main(String[] args) {
        
		//Filter,map,FlatMap
		List<String> l = Arrays.asList("s", "h");

		l.stream().filter(s -> s.equals("s")).forEach(System.out::println);

		l.stream().map(s -> s.length()).forEach(System.out::println);

		List<List<String>> ls = Arrays.asList(l, l);

		ls.stream().filter(f -> f.size() < 0).flatMap(m -> m.stream()).forEach(System.out::println);
		;
		
		//Reduce
		
		List<Integer> li = Arrays.asList(2,3,4,5);
		
		System.out.println("All MAtch :"+li.stream().allMatch(a -> a > 0)); //anyMAtch,NoneMAtch are other extra methods
		
		System.out.println("Sum of Integer"+li.stream().reduce(0,Integer::sum));
		
		Optional<Integer> opt = li.stream().reduce(Integer::max);
		
		if(opt.isPresent())
		{
			System.out.println(opt.get());
		}
		else {
			System.out.println(opt.isPresent());
			try {
				System.out.println(opt.orElseThrow(Exception:: new));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("Count of integre"+li.stream().count());
		//Collectors
		System.out.println(li.stream().collect(Collectors.counting()).intValue());
		
		System.out.println(li.stream().collect(Collectors.toList()));
		
	}

}
