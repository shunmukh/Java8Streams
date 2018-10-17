package com.map.day3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FilesPract {

	public static void main(String[] args) {
		
		try {
			
			Files.lines(Paths.get("/Users/mukesh/untitled.txt")).forEach(l -> System.out.println(l));;
			  
			Files.list(Paths.get("/Users/mukesh")).forEach(f -> System.out.println(f.getFileName()));
			
			Files.walk(Paths.get("/Users/mukesh"), 2).forEach(f -> System.out.println(f.getFileName()));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
