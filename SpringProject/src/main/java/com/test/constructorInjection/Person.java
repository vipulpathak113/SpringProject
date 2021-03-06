package com.test.constructorInjection;

import java.util.List;

public class Person {
	
	private String name;
	private int phoneNumber;
	private Certi certi;
	private List<String> list;
	public Person(String name, int phoneNumber, Certi certi, List<String> list) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.certi = certi;
		this.list = list;
	}
	
	
	@Override
	public String toString() {
		return this.name + " "+ this.phoneNumber + " "+ this.certi.getName() + " "+ this.list;
	}
	
	

}
