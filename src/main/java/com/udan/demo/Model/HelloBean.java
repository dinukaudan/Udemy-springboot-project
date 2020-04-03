package com.udan.demo.Model;

import org.springframework.stereotype.Component;

@Component
public class HelloBean {
private String message;

public HelloBean(String message) {
	super();
	this.message = message;
}

@Override
public String toString() {
	return "HelloBean [message=" + message + "]";
}

public String getMessage() {
	return message;
}

public HelloBean() {
	super();
	// TODO Auto-generated constructor stub
}

public void setMessage(String message) {
	this.message = message;
}


}
