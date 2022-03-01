package com.ait.DemoSpringBootAIT.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ait.DemoSpringBootAIT.model.Student;

@RestController
public class HomeController
{
	@GetMapping("/")
	public Student m1()
	{
		return new Student(1,"Rajdeep",90,"Pune");
	}
}
