package com.students.server;

import java.util.ArrayList;
import java.util.List;

import com.students.entity.Student;

public interface StudentServer {
	public List<Student> selectAllStudent();
	public void deleteStudent(int id);
	public void updateStudent(Student student, int id);// ����ѧ����Ϣ
	public void addStudent(Student student);
	public List<Student> selectStudentByName(String name);

}
