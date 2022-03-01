package com.ait.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ait.Model.Student;
import com.ait.Service.StudentService;

@Controller
public class StudentController
{
	@Autowired
	private StudentService studentService;
	
	@GetMapping("/")
	public ModelAndView startpage()
	{
		List<Student> lst=studentService.getAllStudents();
		ModelAndView mv=new ModelAndView("view");
		mv.addObject("studlist",lst);
		return mv;
	}
	
	@GetMapping("/delete")
	public String deleteStudent(@RequestParam("id") int id)
	{
		Student ob=studentService.getStudentById(id);
		if(ob!=null)
			studentService.deleteStudent(ob);
		return "redirect:/";
	}
	
	@GetMapping("/add")
	public String addNewStudent()
	{
		 return "add";
	}
	
	@GetMapping("/save")
	public String saveStudent(@ModelAttribute("stud") Student s1,BindingResult results) throws Exception
	{
		if(results.hasErrors())
			throw new Exception(results.getObjectName());
		System.out.println(s1);
		studentService.insertStudent(s1);
		return "redirect:/";
	}
	
	@GetMapping("/edit")
	public ModelAndView updateStudent(@RequestParam("id") int id)
	{
		Student s2=studentService.getStudentById(id);
		ModelAndView mv=new ModelAndView("edit");
		mv.addObject("stud",s2);
		return mv;
	}
	
	@GetMapping("/update")
	public String updateStudent(@ModelAttribute("stud") Student s1)
	{
		studentService.updateStudent(s1);
		return "redirect:/";
	}
	
	@ExceptionHandler(value=Exception.class)
	public String someException()
	{
		return "error";
	}
}
