package com.ait.Dao;
import java.util.List;

import com.ait.model.Student;

public interface StudentDao
{
	boolean insertStudent(Student s);
	boolean deleteStudent(Student s);
	boolean updateStudent(Student s);
	List<Student>getAllStudent();
	Student getStudentById(int id);
}
