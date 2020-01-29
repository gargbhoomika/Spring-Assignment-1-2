package com.practice.SpringAssign;

public class HelloWorldBean {
private String message="Hello World";
    
	public HelloWorldBean(){
		message="Constructor";
	}
	public HelloWorldBean(String msg){
		message=msg;
	}
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		
		return "HelloWorldBean [message=" + message + "]";
	}

}
