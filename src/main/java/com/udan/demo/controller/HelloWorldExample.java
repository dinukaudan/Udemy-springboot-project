package com.udan.demo.controller;

import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.udan.demo.Model.HelloBean;

@RestController
public class HelloWorldExample {

	@Autowired
	HelloBean bean;
	
	@GetMapping("/hello")
	public String helloWorldExample() {
	return "HelloWorld";
	}
	@GetMapping("/hellobean")
	public HelloBean helloWorldBeanExample(@PathVariable("id")  String id) {
		bean.setMessage("kamal");
	return bean;
	}
}

