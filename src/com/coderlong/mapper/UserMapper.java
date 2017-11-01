package com.coderlong.mapper;

import java.util.List;

import com.coderlong.po.User;

/**
 *  �û� Dao
 * @author Administrator
 *
 */
public interface UserMapper {
	
	//�����û����� ��ѯ�û� 
	public User findUserByUserName(String username);
	
	//�����û���ID��ѯ �û� 
	public User findUserByUserId(int userId);
	
	//�����û��� ɾ���û�
	public void deleteUserByUserName(String username);
	
	//�����û��� �����û�
	public void updateUserByUserName(String username);
	
	//���� �û����� ��ȡ �û�����
	public String getUserPasswordByUserName(String username);
	
	//�г����е��û� 
	public List<User> getAllUser();
}
