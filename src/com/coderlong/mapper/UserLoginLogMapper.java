package com.coderlong.mapper;

import java.util.List;

import com.coderlong.po.UserLoginLog;

/***
 *  ��¼��־��Dao
 * @author Administrator
 *
 */
public interface UserLoginLogMapper{
	//д�� ��¼��־
	public void addUserLoginLog(UserLoginLog userLoginLog);
	
	// ��ȡ���еĵ�¼��־ 
	public List<UserLoginLog> listAllUserLoginLog();
}
