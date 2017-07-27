package com.sc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sc.mapper.ProjectMapper;
import com.sc.pojo.Project;
import com.sc.pojo.ProjectExample;
import com.sc.pojo.ProjectExample.Criteria;
import com.sc.service.ProjectService;

@Service
public class ProjectServiceImpl implements ProjectService {
	@Autowired
	private ProjectMapper projectMapper;
	
	@Override
	public List<Project> getIndexProjectList() {
		ProjectExample example = new ProjectExample();
		example.setOrderByClause("project_id desc limit 0,10");
		List<Project> projects = projectMapper.selectByExample(example );
		return projects;
	}

}
