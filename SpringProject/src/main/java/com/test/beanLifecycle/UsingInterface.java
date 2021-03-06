package com.test.beanLifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class UsingInterface implements InitializingBean,DisposableBean {
	
	private int price;

	public UsingInterface() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UsingInterface(int price) {
		super();
		this.price = price;
	}

	@Override
	public String toString() {
		return "UsingInterface [price=" + price + "]";
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void destroy() throws Exception {
		System.out.println("in Interface destroy");
		
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("in Interface init");
		
	}
	

}
