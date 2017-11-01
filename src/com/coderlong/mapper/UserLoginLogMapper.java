package com.coderlong.mapper;

import java.util.List;

import com.coderlong.po.UserLoginLog;

/***
 *  登录日志的Dao
 * @author Administrator
 *
 */
public interface UserLoginLogMapper{
	//写入 登录日志
	public void addUserLoginLog(UserLoginLog userLoginLog);
	
	// 获取所有的登录日志 
	public List<UserLoginLog> listAllUserLoginLog();
}
