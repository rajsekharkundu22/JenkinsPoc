package com.example.demo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.JenkinsPocApplication;

@RestController
public class TestController {

	
	
	
	@GetMapping
	public HashMap<Integer, String> getAllUsers() {
		System.out.println(JenkinsPocApplication.map);
		return JenkinsPocApplication.map;
	}

	
	@GetMapping("/{id}")
	public String getUserById(@PathVariable (value = "id") int userId) {
	
	System.out.println(JenkinsPocApplication.map.get(userId));
	return JenkinsPocApplication.map.get(userId);
	}
	
	
}
