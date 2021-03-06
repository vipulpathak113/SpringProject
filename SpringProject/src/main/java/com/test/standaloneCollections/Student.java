package com.test.standaloneCollections;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Student {

	@Override
	public String toString() {
		return "Student [name=" + name + ", courses=" + courses + ", feeStructure=" + feeStructure + ", property="
				+ property + "]";
	}

	private String name;
	private List<String> courses;
	private Map<String, Integer> feeStructure;
	private Properties property;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getCourses() {
		return courses;
	}

	public void setCourses(List<String> courses) {
		this.courses = courses;
	}

	public Map<String, Integer> getFeeStructure() {
		return feeStructure;
	}

	public void setFeeStructure(Map<String, Integer> feeStructure) {
		this.feeStructure = feeStructure;
	}

	public Properties getProperty() {
		return property;
	}

	public void setProperty(Properties property) {
		this.property = property;
	}

}
