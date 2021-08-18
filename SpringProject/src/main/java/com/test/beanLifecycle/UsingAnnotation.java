package com.test.beanLifecycle;

public class UsingAnnotation {
	
	private int price;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "UsingAnnotation [price=" + price + "]";
	}

	public UsingAnnotation(int price) {
		super();
		this.price = price;
	}

	public UsingAnnotation() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
