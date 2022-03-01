package com.ait.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ait.dto.Item;
import com.ait.model.Product;
import com.ait.model.UserInfo;
import com.ait.service.ProductService;
import com.ait.service.UserService;

@Controller
public class LoginController 
{
	@Autowired
	private UserService userservice;
	
	@Autowired
	private ProductService productservice;
	
	@GetMapping("/")
	public String startpage()
	{
		return "index";
	}
	
	@GetMapping("/signin")
	public String login(Model m, HttpServletRequest req) {
		/*
		 * HttpSession session=req.getSession(); if(session!=null) return "/view";
		 * m.addAttribute("status", req.getAttribute("status"));
		 */
		return "login";
	}
	
	@GetMapping("/signup")
	public String signup()
	{
		return "signup";
	}
	
	@GetMapping("/saveuser")
	public String saveUser(@ModelAttribute UserInfo u)
	{
		userservice.insertUser(u);
		return "redirect:/signin";
	}
	
	
	@GetMapping("/validate")
	public String ValidateUser(@ModelAttribute UserInfo user, HttpServletRequest req) {
		String usernm = user.getUsername();
		String pass = user.getPassword();
		
		UserInfo u1 = userservice.getUserByNameAndPassword(usernm, pass);
		if (u1 == null) 
		{
			req.setAttribute("status", "Invalid username and password");
			return "forward:/signin";
		} 
		else
		{
			HttpSession session = req.getSession();
			String role=u1.getRole().getRoleType();
			ArrayList<Item> cartlist=new ArrayList<Item>();
			session.setAttribute("cartlist", cartlist);
			session.setAttribute("userrole", role);
			session.setAttribute("username", u1.getUsername());
			if(role.equalsIgnoreCase("admin"))
				return "admin";
			else
				return "ViewCart";
		}
		
		
	}
	
	@GetMapping("/viewproducts")
	public ModelAndView viewProducts() 
	{
		List<Product> lst = productservice.getAllProduct();
		System.out.println("(((((((((((((((("+lst);
		ModelAndView mv = new ModelAndView("viewprod");
		mv.addObject("productlist", lst);
		return mv;

	}
	
	//product
	
	@GetMapping("/product")
	public ModelAndView products()
	{
		List<Product> lst=productservice.getAllProduct();
		ModelAndView mv=new ModelAndView("view");
		mv.addObject("productlist",lst);
		return mv;
	}
	
	@GetMapping("/addproduct")
	public String addNewProduct()
	{
		 return "add";
	}
	
	
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
	@GetMapping("/delete")
	public String deleteProduct(@RequestParam("id") int id)
	{
		Product ob=productservice.getProductById(id);
		if(ob!=null)
			productservice.deleteProduct(ob);
		return "redirect:/product";
	}
	
	// user crud
	
	@GetMapping("/userinfo")
	public ModelAndView userInfo()
	{
		List<UserInfo> lst=userservice.getAllUsers();
		System.out.println("*********"+lst);
		ModelAndView mv=new ModelAndView("ViewAllUsers");
		mv.addObject("userlist",lst);
		return mv;
	}
	//addd to cart
	
	@GetMapping("/viewallproducts")
	public ModelAndView viewallproducts()
	{
		List<Product> lst=productservice.getAllProduct();
		ModelAndView mv=new ModelAndView("allproducts");
		mv.addObject("productlist",lst);
		return mv;
	}
	
	@GetMapping("/addtocart")
	public String addToCart(HttpServletRequest req) {
		HttpSession session = req.getSession(false);
		if (session == null) {
			return "redirect:/login";
		} 
		else 
		{
			ArrayList<Item> al =new ArrayList<>();

			int pid = Integer.parseInt(req.getParameter("id"));
			Product p1 = productservice.getProductById(pid);
			al.add(new Item(p1.getId(), p1.getName(), p1.getPrice(),1));
			System.out.println("***************"+al);
			session.setAttribute("cartlist", al);
			return "forward:/viewallproducts";
		}
	}
	@GetMapping("/viewcart")
	public String viewCart(HttpServletRequest req, Model m) {
		HttpSession session = req.getSession(false);
		if (session != null) 
		{	
			ArrayList<Item> arr = (ArrayList<Item>) session.getAttribute("cartlist");
			m.addAttribute("cartlist", arr);
			System.out.println("***************"+arr);
		}
		return "cart";
	}
	
	@GetMapping("/placeorder")
	public String address()
	{
		return "address";
	}
	
	@GetMapping("/order")
	public String lastpage() 
	{
		return "last";
	}
}
