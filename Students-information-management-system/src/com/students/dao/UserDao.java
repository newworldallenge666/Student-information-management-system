package com.students.dao;

import java.util.List;

import com.students.entity.User;


public interface UserDao {

	public boolean UserChek(User user);
	public List<User> showAllUser();
	public void deleteUer(int id);// ɾ������Ա
	public void updateUser(User user, int id);// �޸Ĺ���Ա��Ϣ
	//public void register(User user);// register����Ա
	public boolean addUser(User user);//��ӹ���Ա
	
}
