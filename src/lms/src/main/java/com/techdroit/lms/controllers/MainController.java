package com.techdroit.lms.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.techdroit.lms.services.LmsService;

@Controller
public class MainController {

	@Autowired
	private LmsService lmsService;
	
	@GetMapping(value = "/")
	public String init(HttpServletRequest request) {
		request.setAttribute("books", lmsService.findAllBooks());
		return "index";
	}
}