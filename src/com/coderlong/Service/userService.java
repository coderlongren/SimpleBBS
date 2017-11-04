package com.coderlong.Service;

import java.util.List;

import com.coderlong.po.User;

public interface userService {
	//增加用户
    public void addUser(User user);
    //更新用户 通过用户名
    public void updateUserByUserName(User user);
    //通过用户名获得用户对象
    public User getUserByUserName(String userName);
    // 通过 用户名删除用户
    public void deleteUserByUserName(String userName);
    // 登录成功 
    public void loginSuccess(User user);
    // 通过用户名获取 用户 密码 
    public String getPassword(String userName);
    // 获得所有用户列表
    public List<User> getAllUser();
}
