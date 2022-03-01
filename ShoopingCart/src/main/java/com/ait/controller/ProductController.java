package com.ait.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ait.model.Product;
import com.ait.model.UserInfo;
import com.ait.service.ProductService;
import com.ait.service.UserService;

@Controller
public class ProductController 
{
	@Autowired
	private ProductService productservice;
	
	/*
	@GetMapping("/")
	public String homePage()
	{
		return "login";
	}
	
	@GetMapping("/signup")
	public String signup()
	{
		return "signup";
	}
	
	@GetMapping("/logout")
	public String Page()
	{
		return "login";
	}
	
	@GetMapping("/product")
	public ModelAndView startpage()
	{
		List<Product> lst=productservice.getAllProduct();
		ModelAndView mv=new ModelAndView("view");
		mv.addObject("productlist",lst);
		return mv;
	}
	
	@GetMapping("/delete")
	public String deleteProduct(@RequestParam("id") int id)
	{
		Product ob=productservice.getProductById(id);
		if(ob!=null)
			productservice.deleteProduct(ob);
		return "redirect:/product";
	}
	
	@GetMapping("/add")
	public String addNewProduct()
	{
		 return "add";
	}
	/*
	@GetMapping("/save")
	public String saveProduct(@ModelAttribute("product") Product p1,BindingResult results) throws Exception
	{
		if(results.hasErrors())
			throw new Exception(results.getObjectName());
		System.out.println(p1);
		productservice.insertProduct(p1);
		return "redirect:/product";
	}
	*/
	/*
	@GetMapping("/save")
	public String saveProduct(@ModelAttribute("product") Product p1)
	{
		System.out.println(p1);
		productservice.insertProduct(p1);
		return "redirect:/product";
	}
	
	@GetMapping("/edit")
	public ModelAndView updateProduct(@RequestParam("id") int id)
	{
		Product p2=productservice.getProductById(id);
		ModelAndView mv=new ModelAndView("edit");
		mv.addObject("product",p2);
		return mv;
	}
	
	@GetMapping("/update")
	public String updateProduct(@ModelAttribute("product") Product p1)
	{
		productservice.updateProduct(p1);
		return "redirect:/product";
	}
	
	*/
	/*
	@ExceptionHandler(value=Exception.class)
	public String someException()
	{
		return "error";
	}
	
	*/
}
