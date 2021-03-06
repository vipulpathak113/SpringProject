package com.test.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {

	// invoking static object
	@Value("#{new java.lang.String('Vipul')}")
	private String name;

	// invoking static method
	@Value("#{T(java.lang.Math).sqrt(25)}")
	private double salary;

	// invoking static variable
	@Value("#{T(java.lang.Math).PI}")
	private double yoe;

	@Value("#{5>3}")
	private boolean isActive;

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", yoe=" + yoe + ", isActive=" + isActive + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getYoe() {
		return yoe;
	}

	public void setYoe(double yoe) {
		this.yoe = yoe;
	}

}
