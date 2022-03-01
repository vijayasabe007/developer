package com.ait.controller;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.ait.Service.StudentService;
import com.ait.model.Student;
@Controller
public class StudentController
{
	@Autowired
	 private StudentService studentservice;
	
	@ResponseBody
	@GetMapping(value = "/students")
	public List<Student> getAllStudent()
	{
		return studentservice.getAllStudents();
	}
	
	@ResponseBody
	@GetMapping(value = "/students/{id}")
	public Student getStudentById(@PathVariable("id") int id)
	{
		return studentservice.getStudentById(id);
	}
	
	@ResponseBody
	@PostMapping(value = "/students")
	public boolean addStudent(@RequestBody Student s)
	{
		System.out.println("*****"+s);
		studentservice.insertStudent(s);
		return true;
	}
	
	@ResponseBody
	@DeleteMapping(value = "/students/{id}")
	public boolean deleteStudentById(@PathVariable("id") int id)
	{
		Student s1=studentservice.getStudentById(id);
		studentservice.deleteStudent(s1);
		return true;//new ResponseEntity<>(HttpStatus.OK);
	}
	
	@ResponseBody
	@PutMapping(value = "/students/{id}")
	public boolean updateStudent(@PathVariable("id") int id,@RequestBody Student s)
	{
		studentservice.updateStudent(s);
		return true;
	}
	
	@ResponseStatus(code = HttpStatus.NOT_FOUND,reason="Invalid id")
	@ExceptionHandler(IllegalArgumentException.class)
	public void myExceptionHandler(Exception e)
	{
		
	}

}
