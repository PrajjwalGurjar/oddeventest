package com.in28minutes.rest.webservices.restfulwebservices.helloworld;

public class HelloWorldBean {

	private String userid;
	private String message;
	
	private boolean is_success;
	
	private int odd[] ;
	private int even[] ;
	
	
	
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public int[] getOdd() {
		return odd;
	}
	public void setOdd(int[] odd) {
		this.odd = odd;
	}
	public int[] getEven() {
		return even;
	}
	public void setEven(int[] even) {
		this.even = even;
	}
	public HelloWorldBean() {
		
	}
	public HelloWorldBean(String message) {
		
		this.message=message;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return String.format("HelloWorldBean [message=%s]", 
				message);
	}
	public boolean isIs_success() {
		return is_success;
	}
	public void setIs_success(boolean is_success) {
		this.is_success = is_success;
	}
	
}
