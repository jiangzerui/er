package com.sc.service;

import java.util.List;

import com.sc.pojo.Menu;

public interface MenuService {
	
	/**
	 * 通过角色code 获取菜单列表
	 * @param roleCode
	 * @return
	 */
	public List<Menu> findMenuByRoleCode(String roleCode);
	
}
