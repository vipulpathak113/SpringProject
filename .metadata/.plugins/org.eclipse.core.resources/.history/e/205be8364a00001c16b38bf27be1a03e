package com.test.beanLifecycle;

public class Car {
	
	@Override
	public String toString() {
		return "Car [price=" + price + "]";
	}

	private int price;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Car(int price) {
		super();
		this.price = price;
	}

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void init() {
		System.out.println("in init");
	}
	
	public void destroy() {
		System.out.println("in destroy");
	}
	

}
