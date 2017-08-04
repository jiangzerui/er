package com.sc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.mapper.ProfessorMapper;
import com.sc.pojo.Professor;
import com.sc.pojo.ProfessorExample;
import com.sc.pojo.ProfessorExample.Criteria;
import com.sc.service.ProfessorService;

@Service
public class ProfessorServiceImpl implements ProfessorService {
	@Autowired
	private ProfessorMapper professorMapper;
	
	@Override
	public PageInfo<Professor> findByClassAndPage(String classCode, int page) {
		ProfessorExample example = new ProfessorExample();
		if(classCode==null){//查询所有
			example = null;
		}else{	//通过类别完成查询
			Criteria c = example.createCriteria();
			c.andClassidEqualTo(classCode);
		}
		PageHelper.startPage(page, 5);
		List<Professor> ps = professorMapper.selectByExample(example);
		PageInfo<Professor> pageInfo = new PageInfo<Professor>(ps);
		return pageInfo;
	}

}
