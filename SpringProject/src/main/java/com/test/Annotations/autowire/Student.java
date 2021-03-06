package com.test.Annotations.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {
	@Autowired
	@Qualifier("temp2")
	private Address adress;

	public Student() {
		super();
		System.out.println("inside constructorrr");
	}

	public Address getAdress() {
		return adress;
	}

	public void setAdress(Address adress) {
		this.adress = adress;
		System.out.println("inside setter");
	}

	@Override
	public String toString() {
		return "Student [adress=" + adress + "]";
	}

	public Student(Address adress) {
		super();
		this.adress = adress;
	}

}
