package com.udan.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.udan.demo.springtest.BinarySEarchImpl;
import com.udan.demo.springtest.BubbleSort;
import com.udan.demo.springtest.QuickSort;

@SpringBootApplication
public class UdemySpringbootCourseApplication {
	
	

	public static void main(String[] args) {
		
		ApplicationContext aplApplicationContext=SpringApplication.run(UdemySpringbootCourseApplication.class, args);
		BinarySEarchImpl binarySEarchImpl=aplApplicationContext.getBean(BinarySEarchImpl.class);
		
		
	int result=	binarySEarchImpl.binarySearch(new int[] {12, 2,2,345,6}, 4);
	System.out.println(result);
		
	
	}

}
