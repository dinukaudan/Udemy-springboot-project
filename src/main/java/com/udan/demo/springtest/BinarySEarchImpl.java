package com.udan.demo.springtest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class BinarySEarchImpl {

	@Autowired
private SortAlgorithm sortAlgorithm;

	

	public int binarySearch(int [] numbers, int numberForSearch) {
	int[] sortednumbers=sortAlgorithm.sort(numbers);
	return 3;
	}
}
