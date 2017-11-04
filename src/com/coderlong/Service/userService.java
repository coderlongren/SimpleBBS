package com.coderlong.Service;

import java.util.List;

import com.coderlong.po.User;

public interface userService {
	//�����û�
    public void addUser(User user);
    //�����û� ͨ���û���
    public void updateUserByUserName(User user);
    //ͨ���û�������û�����
    public User getUserByUserName(String userName);
    // ͨ�� �û���ɾ���û�
    public void deleteUserByUserName(String userName);
    // ��¼�ɹ� 
    public void loginSuccess(User user);
    // ͨ���û�����ȡ �û� ���� 
    public String getPassword(String userName);
    // ��������û��б�
    public List<User> getAllUser();
}
