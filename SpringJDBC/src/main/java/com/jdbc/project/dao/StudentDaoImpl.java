package com.jdbc.project.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

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

	public int delete(int id) {
		String query = "delete from student where id=?";
		int result = this.template.update(query, id);
		return result;
	}

	public Student getStudent(int id) {
		String query = "select * from student where id=?";
		RowMapper<Student> rowMapper = new RowMapperImpl();
		Student result = this.template.queryForObject(query, rowMapper, id);
		return result;

	}

	public List<Student> getAllStudents() {
		String query = "select * from student";
		RowMapper<Student> rowMapper = new RowMapperImpl();
		List<Student> result = this.template.query(query, rowMapper);
		return result;
	}
}
