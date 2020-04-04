package com.udan.demo.Model;


public class Book {
private int id;
private String name;
private String address;
public int getId() {
	return id;
}
public String getName() {
	return name;
}
public String getAddress() {
	return address;
}
public Book(int id, String name, String address) {
	super();
	this.id = id;
	this.name = name;
	this.address = address;
}
@Override
public String toString() {
	return "Book [id=" + id + ", name=" + name + ", address=" + address + "]";
}



}
