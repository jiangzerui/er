package com.sc.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sc.mapper.MenuMapper;
import com.sc.mapper.RoleMenuMapper;
import com.sc.pojo.Menu;
import com.sc.pojo.MenuExample;
import com.sc.pojo.RoleMenu;
import com.sc.pojo.RoleMenuExample;
import com.sc.pojo.RoleMenuExample.Criteria;
import com.sc.service.MenuService;

@Service
public class MenuServiceImpl implements MenuService {
	@Autowired
	private RoleMenuMapper roleMenuMapper;
	@Autowired
	private MenuMapper menuMapper;
	
	@Override
	public List<Menu> findMenuByRoleCode(String roleCode) {
		//通过roleCode 查询 roleMenu 获取匹配的 menuCode
		RoleMenuExample e1 = new RoleMenuExample();
		Criteria c1 = e1.createCriteria();
		c1.andRoleCodeEqualTo(roleCode);
		List<RoleMenu> roleMenus = roleMenuMapper.selectByExample(e1);
		List<Menu> menus = new ArrayList<Menu>();
		for(RoleMenu rm : roleMenus){
			MenuExample e2 = new MenuExample();
			MenuExample.Criteria c2 = e2.createCriteria();
			c2.andMenuCodeEqualTo(rm.getMenuCode());
			List<Menu> ms = menuMapper.selectByExample(e2);
			if(ms!=null && ms.size()>0){
				menus.add(ms.get(0));
			}
		}
		return menus;
	}

}
