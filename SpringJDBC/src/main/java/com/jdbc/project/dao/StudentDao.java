package com.jdbc.project.dao;

import com.jdbc.project.entities.Student;

public interface StudentDao {

	public int insert(Student student);

	public int update(Student student);

	public int delete(int id);

}
