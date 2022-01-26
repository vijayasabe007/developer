package com.Controller;

import java.sql.Date;
import java.util.List;
import java.util.Scanner;

import com.Dao.StudentDao;
import com.Dao.StudentDaoImplementation;
import com.Model.Student;

public class StudentController
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		StudentDao sdao = new StudentDaoImplementation();
		System.out.println("**********Welcome USer********* ");
		char ch = 'y';
		do 
		{
			System.out.println("1.Add New Student");
			System.out.println("2.Delete  Student");
			System.out.println("3.Update Student");
			System.out.println("4.View All Student");
			System.out.println("Enter Your Choice =>  ");
			int choice = sc.nextInt();

			switch (choice) 
			{
			case 1:

				System.out.println("*******Insert New Student Record******* ");
				System.out.println("Enter Name => ");
				String nm = sc.next();
				System.out.println("Enter Percent => ");
				int per = sc.nextInt();
				System.out.println("Enter Date of Birth (yyyy-mm-dd)=> ");
				String birthdate = sc.next();

				Date bdate = Date.valueOf(birthdate);

				System.out.println("Enter City Name=> ");
				String city = sc.next();

				Student s1 = new Student(nm, per, bdate, city);
				boolean isInsert = sdao.insertStudent(s1);

				if (isInsert)
					System.out.println("Record Inserted Successfully");
				else
					System.out.println("Error! Unsuccessfully");
				break;
			case 2:
				System.out.println("********Deletion********");
				System.out.println("Enter studentid to delete");
				int sid = sc.nextInt();
				Student sobj = sdao.getStudentById(sid);
				if (sobj == null)
					System.out.println("Invalid student id");
				else {
					boolean isdelete = sdao.deleteStudentById( sid);
					System.out.println(isdelete ? "Student deleted successfully" : "Unsuccessful Deletion");
				}
				break;
			case 3:
				System.out.println("*****update*****");
				System.out.println("Enter Stuent id to update => ");
				sid = sc.nextInt();
				sobj = sdao.getStudentById(sid);
				if (sobj == null)
					System.out.println("Invalid Student id");
				else {
					System.out.println("Current name => " + sobj.getSname());
					System.out.println("Current percent => " + sobj.getPercent());
					System.out.println("Current city => " + sobj.getCity());
					System.out.println("Enter Percent & city to update => ");
					int new_percent = sc.nextInt();
					String new_city = sc.next();
					sobj.setPercent(new_percent);
					sobj.setCity(new_city);
					sdao.updateStudent(sobj);

					boolean isUpdate = sdao.updateStudent(sobj);
					if (isUpdate)
						System.out.println("Record Updated Successfully");
					else
						System.out.println("Error! Unsuccessfully");

				}
				break;
			case 4:
				System.out.println("***** VIEW LIST*****");
				List<Student> studentlist = sdao.getAllStudents();
				for (Student ob : studentlist) {
					System.out.println(ob);
				}
				break;
			}

			System.out.println("Do You Want to Continue  => ");
			ch = sc.next().charAt(0);
		} while (ch == 'y' || ch == 'Y');
	}

}
