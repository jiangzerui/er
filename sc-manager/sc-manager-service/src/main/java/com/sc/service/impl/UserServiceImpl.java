package com.sc.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sc.common.pojo.ScResult;
import com.sc.common.utils.IDUtils;
import com.sc.common.utils.MD5Encrypt;
import com.sc.common.utils.SConsts;
import com.sc.mapper.UserMapper;
import com.sc.mapper.UserRoleMapper;
import com.sc.pojo.Role;
import com.sc.pojo.User;
import com.sc.pojo.UserExample;
import com.sc.pojo.UserRole;
import com.sc.pojo.UserRoleExample;
import com.sc.pojo.UserExample.Criteria;
import com.sc.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userMapper;
	@Autowired
	private UserRoleMapper userRoleMapper;
	
	@Override
	public ScResult saveUser(User user) {
		//判断用户名是否已存在
		User dbuser=findByLoginname(user.getLoginName());
		if(dbuser!=null){
			return ScResult.build(SConsts.CODE_ERROR, "用户已存在");
		}
		String userCode = IDUtils.genUserCode();
		user.setUserCode(userCode);
		user.setPassword(MD5Encrypt.MD5Encode(user.getPassword()));
		userMapper.insertSelective(user);
		UserRole record = new UserRole();
		record.setUserCode(userCode);
		record.setRoleCode("10001");
		userRoleMapper.insert(record);
		return ScResult.ok();
	}

	@Override
	public User findByLoginname(String loginname) {
		UserExample example = new UserExample();
		Criteria c = example.createCriteria();
		c.andLoginNameEqualTo(loginname);
		List<User> users = userMapper.selectByExample(example);
		if(users!=null && users.size()>0){
			return users.get(0);
		}
		return null;
	}

	@Override
	public List<Role> getUserRoleByLoginname(String loginname) {
		List<Role> roles = new ArrayList<Role>();
		UserExample example = new UserExample();
		Criteria c1 = example.createCriteria();
		c1.andLoginNameEqualTo(loginname);
		List<User> users=userMapper.selectByExample(example);
		if(users!=null && users.size()>0){//找到了这个人
			roles = userRoleMapper.selectRolesByUserCode(users.get(0).getUserCode());
			return roles;
		}
		return roles;
	}

}







