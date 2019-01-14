package com.nishant.controller;

import org.hibernate.annotations.Parameter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.nishant.model.User;

@Controller
public class UserController {
	private final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	
	@RequestMapping(value="/index.html", method=RequestMethod.GET)
	public String indexpage() {
		return "index";
	}
	
	@RequestMapping(value="/adduser.html", method=RequestMethod.GET)
	public String hello() {
		return "adduser";
	}
	
	@RequestMapping(value="/user.html", method=RequestMethod.POST)
	public ModelAndView userData() {
		
		return new ModelAndView("index","msg","User has been added successfully...!!");
	}
	
	@RequestMapping(value="/delete/{id}", method=RequestMethod.POST)
	public ModelAndView deleteuser(@PathVariable("id") int id, User user) {
		
		return new ModelAndView("index","msg","User has been added successfully...!!");
	}
	
	@RequestMapping(value="/update/{id}", method=RequestMethod.POST)
	public ModelAndView updateUser(@PathVariable("id") int id, User user) {
		
		return new ModelAndView("index","msg","User has been added successfully...!!");
	}
	
	@RequestMapping(value="/listall", method=RequestMethod.POST)
	public ModelAndView allUser() {
		
		return new ModelAndView("index","msg","User has been added successfully...!!");
	}
	
	@RequestMapping(value="/userbyid/{id}", method=RequestMethod.POST)
	public ModelAndView userId(@PathVariable("id") int id, User user) {
		
		return new ModelAndView("index","msg","User has been added successfully...!!");
	}
}
