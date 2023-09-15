package com.example.demo;

import java.util.HashMap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsPocApplication {
	
	public static HashMap<Integer,String> map = new HashMap<>();

	public static void main(String[] args) {
		
		
		SpringApplication.run(JenkinsPocApplication.class, args);
			map.put(1,"Mark1");
			map.put(2, "Mark2");
			map.put(3, "Mark3");
			map.put(4, "Mark4");
			map.put(5, "Mark5");
			map.put(6, "Mark6");
	
	}

}
