package com.techdroit.lms.controller.rest;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.techdroit.lms.models.Book;
import com.techdroit.lms.services.LmsService;

@RestController
public class MainRestController {

	@Autowired
	private LmsService lmsService;
	
	@GetMapping(value="/")
	public String hello() {
		return "Hello World!";
	}
	
	@GetMapping("/findAllBooks")
	public Collection<Book> getAllBooks(){
		return lmsService.findAllBooks();
	}
	
	@GetMapping("/delete")
	public void deleteRecord(@RequestParam long id) {
		lmsService.delete(id);
	}
}