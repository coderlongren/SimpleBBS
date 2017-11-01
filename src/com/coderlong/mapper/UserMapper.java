package com.coderlong.mapper;

import java.util.List;

import com.coderlong.po.User;

/**
 *  用户 Dao
 * @author Administrator
 *
 */
public interface UserMapper {
	
	//根据用户名字 查询用户 
	public User findUserByUserName(String username);
	
	//根据用户的ID查询 用户 
	public User findUserByUserId(int userId);
	
	//根据用户名 删除用户
	public void deleteUserByUserName(String username);
	
	//根据用户名 更新用户
	public void updateUserByUserName(String username);
	
	//根据 用户名字 获取 用户密码
	public String getUserPasswordByUserName(String username);
	
	//列出所有的用户 
	public List<User> getAllUser();
}
