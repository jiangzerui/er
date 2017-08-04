package com.sc.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.sc.pojo.Professor;

public interface ProfessorService {
	
	/**
	 * 通过类别码与页码完成分页加载专家列表业务
	 * @param classCode 如果为null，则查询所有
	 * @param page
	 * @return
	 */
	public PageInfo<Professor> findByClassAndPage(String classCode, int page);
	
}
