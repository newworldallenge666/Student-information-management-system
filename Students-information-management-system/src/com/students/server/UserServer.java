package com.students.server;

import java.util.List;

import com.students.entity.User;
import com.students.dao.UserDao;

public interface UserServer {

	public boolean UserChek(User user);

	public List<User> showAllUser();
	public void deleteUser(int id);// ɾ������Ա
	public void updateUser(User user, int id);// �޸Ĺ���Ա��Ϣ
	//public void register(User user);
	public boolean addUser(User user);//��ӹ���Ա
	
}
