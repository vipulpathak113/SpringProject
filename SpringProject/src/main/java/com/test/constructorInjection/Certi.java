package com.test.constructorInjection;

public class Certi {
	
	private String name;

	@Override
	public String toString() {
		return this.name;
	}

	public Certi(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



}
