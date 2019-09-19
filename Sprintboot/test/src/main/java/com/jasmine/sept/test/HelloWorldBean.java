package com.jasmine.sept.test;

public class HelloWorldBean {
	
	private String message;
	private int num;
	public HelloWorldBean(String message, int num) {
		this.message=message;
		this.num=num;
	}
	
	public HelloWorldBean(String message) {
		this.message=message;
	}
	public void setMessage (String message) {
		this.message=message;
	}
	@Override
	public String toString() {
		return "helloWorldBean [message: "+ message +"]";
	}
	
	public String getString() {
		return message;
	}
	public int getNum() {
		return num;
	}
}
