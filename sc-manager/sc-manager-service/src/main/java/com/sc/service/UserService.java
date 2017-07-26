package com.sc.service;

import java.util.List;

import com.sc.common.pojo.ScResult;
import com.sc.pojo.Role;
import com.sc.pojo.User;

public interface UserService {
	
	/**
	 * 保存用户，如果保存失败，返回ScResult中含有失败信息
	 * @param user
	 * @return
	 */
	ScResult saveUser(User user);
	
	/**
	 * 根据用户名查询用户
	 * @param loginname
	 * @return
	 */
	User findByLoginname(String loginname);

	/**
	 * 通过用户名 查询该用户所拥有的所有角色
	 * @param username
	 * @return
	 */
	List<Role> getUserRoleByLoginname(String loginname);
	
}
