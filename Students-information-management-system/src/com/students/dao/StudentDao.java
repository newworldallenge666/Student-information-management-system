package com.students.dao;

import java.util.List;

import com.students.entity.Student;

public interface StudentDao {
	public List<Student> selectAllStudent();// ��ѯ����ѧ��
	public void deleteStudent(int id);
	public void updateStudent(Student student, int id);// ����ѧ����Ϣ
	public void addStudent(Student student);
	public List<Student> selectStudentByName(String name);// ����ѧ��������ѯѧ��
	//public Student selectStudentByName(String name);


}
