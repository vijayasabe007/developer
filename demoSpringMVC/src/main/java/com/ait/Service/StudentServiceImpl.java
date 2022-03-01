package com.ait.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ait.Dao.StudentDao;
import com.ait.Dao.StudentDaoImplementations;
import com.ait.Model.Student;
@Service
public class StudentServiceImpl implements StudentService
{
	
	@Autowired
	private StudentDao sdao;
	
	@Override
	public boolean insertStudent(Student s) {
		// TODO Auto-generated method stub
		return sdao.insertStudent(s);
	}

	@Override
	public boolean deleteStudent(Student s) {
		// TODO Auto-generated method stub
		return sdao.deleteStudent(s);
	}

	@Override
	public boolean updateStudent(Student s) {
		// TODO Auto-generated method stub
		sdao.updateStudent(s);
		return true;
	}

	@Override
	public List<Student> getAllStudents() {
		return sdao.getAllStudent(); 
	}

	@Override
	public Student getStudentById(int id) {
		// TODO Auto-generated method stub
		return sdao.getStudentById(id);
	}

}
