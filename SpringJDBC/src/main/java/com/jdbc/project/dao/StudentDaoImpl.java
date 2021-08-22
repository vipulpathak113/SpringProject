package com.jdbc.project.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.jdbc.project.entities.Student;

public class StudentDaoImpl implements StudentDao {

	private JdbcTemplate template;

	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	public int insert(Student student) {
		String query = "insert into student(id,name,city) values(?,?,?)";
		int result = this.template.update(query, student.getId(), student.getName(), student.getCity());
		return result;
	}

	public int update(Student student) {
		String query = "update student set name=?,city=? where id=?";
		int result = this.template.update(query, student.getName(), student.getCity(), student.getId());
		return result;
	}

}
