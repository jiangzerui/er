package com.sc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sc.common.utils.UniqueCodeGenerator;
import com.sc.mapper.GuideMapper;
import com.sc.mapper.OrgnaizationMapper;
import com.sc.mapper.ProjectMapper;
import com.sc.mapper.ProjectOrgnaizationMapper;
import com.sc.pojo.Guide;
import com.sc.pojo.Orgnaization;
import com.sc.pojo.Project;
import com.sc.pojo.ProjectExample;
import com.sc.pojo.ProjectExample.Criteria;
import com.sc.pojo.ProjectOrgnaization;
import com.sc.service.ProjectService;

@Service
public class ProjectServiceImpl implements ProjectService {
	@Autowired
	private ProjectMapper projectMapper;
	@Autowired
	private GuideMapper guideMapper;
	@Autowired
	private ProjectOrgnaizationMapper projectOrgnaizationMapper;
	@Override
	public List<Project> getIndexProjectList() {
		ProjectExample example = new ProjectExample();
		example.setOrderByClause("project_id desc limit 0,10");
		List<Project> projects = projectMapper.selectByExample(example );
		return projects;
	}

	@Override
	public Project getProjectById(int projectId) {
		ProjectExample example = new ProjectExample();
		Criteria c = example.createCriteria();
		c.andProjectIdEqualTo(projectId);
		List<Project> ps = projectMapper.selectByExample(example);
		if(ps!=null && ps.size()>0){
			return ps.get(0);
		}
		return null;
	}

	@Override
	public void saveProject(Project project, List<Guide> guides, String orgs) {
		//添加guide指南信息
		for(Guide g : guides){
			guideMapper.insert(g);
		}
		//添加project信息
		projectMapper.insert(project);
		//关联组织信息
		String[] orgIds = orgs.split(",");
		for(int i=0; i<orgIds.length; i++){
			ProjectOrgnaization o = new ProjectOrgnaization();
			o.setOrganizationId(Integer.parseInt(orgIds[i]));
			o.setProjectCode(project.getProjectCode());
			projectOrgnaizationMapper.insert(o);
		}
	}

}





