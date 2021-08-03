package com.in28minutes.rest.webservices.restfulwebservices.helloworld;

public class Helloworldservice {
	
public HelloWorldBean sortArray(int[] arr) {
	HelloWorldBean hello = new HelloWorldBean();
	 int n = arr.length ;
		int [] odd = new int [n];
		int [] even = new int [n];
		
		for(int i =0; i< arr.length ; i++) {
			
			if(arr[i]%2==0) {
				
				even[i] = arr[i];
				
				
			}else {
				
				odd[i] = arr[i];
			}
			
		}
		
		hello.setIs_success(true);
		hello.setOdd(odd);
		hello.setEven(even);
		hello.setUserid("john_doe_17091999");
		return hello;
}
}
