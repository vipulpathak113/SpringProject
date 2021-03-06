package com.test.spel;

import java.util.Date;

public class Inventor {

	private String name;
	private Date birthday;
	private String nationality;

	public String getName() {
		return name;
	}

	public Inventor(String name, Date birthday, String nationality) {
		super();
		this.name = name;
		this.birthday = birthday;
		this.nationality = nationality;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

}
