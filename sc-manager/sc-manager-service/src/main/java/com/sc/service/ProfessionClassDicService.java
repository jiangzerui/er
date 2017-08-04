package com.sc.service;

import java.util.List;

import com.sc.pojo.ProfessionClassDic;

public interface ProfessionClassDicService {
	
	/**
	 * 查找所有的专家类别
	 * @return
	 */
	public List<ProfessionClassDic> getAll();
	
}
