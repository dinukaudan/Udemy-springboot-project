package com.udan.demo.springtest;

import org.springframework.stereotype.Component;
@Component
public class BubbleSort implements SortAlgorithm{
	
	public int[] sort(int[] numbers) {
		System.err.println("Bubble sort");
		return numbers;
	}
	
}
