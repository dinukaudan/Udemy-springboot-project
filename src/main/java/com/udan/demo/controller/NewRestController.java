package com.udan.demo.controller;



import java.util.Arrays;
import java.util.List;

import org.apache.catalina.startup.HomesUserDatabase;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.udan.demo.Model.Book;

@RestController
public class NewRestController {

	@GetMapping("books")
	public List<Book> name() {
		return Arrays.asList(new Book(1, "Kalanage Nangi ekka", "Kalana Vishwanath"));
		
	}
}
