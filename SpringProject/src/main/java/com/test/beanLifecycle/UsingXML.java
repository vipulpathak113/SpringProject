package com.test.beanLifecycle;

public class UsingXML {
	
	@Override
	public String toString() {
		return "UsingXML [price=" + price + "]";
	}

	private int price;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public UsingXML(int price) {
		super();
		this.price = price;
	}

	public UsingXML() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void init() {
		System.out.println("in XML init");
	}
	
	public void destroy() {
		System.out.println("in XML destroy");
	}
	

}
