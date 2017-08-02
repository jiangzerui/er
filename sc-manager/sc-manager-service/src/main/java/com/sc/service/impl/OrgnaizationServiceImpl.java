package com.sc.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sc.mapper.OrgnaizationMapper;
import com.sc.mapper.ProjectOrgnaizationMapper;
import com.sc.pojo.Orgnaization;
import com.sc.pojo.OrgnaizationExample;
import com.sc.pojo.OrgnaizationExample.Criteria;
import com.sc.pojo.ProjectOrgnaization;
import com.sc.pojo.ProjectOrgnaizationExample;
import com.sc.service.OrgnaizationService;
import com.sun.org.apache.xpath.internal.operations.Or;

@Service
public class OrgnaizationServiceImpl implements OrgnaizationService {
	@Autowired
	private OrgnaizationMapper orgnaizationMapper;
	@Autowired
	private ProjectOrgnaizationMapper projectOrgnaizationMapper;
	
	@Override
	public List<Orgnaization> getByNameLike(String name) {
		OrgnaizationExample example = new OrgnaizationExample();
		Criteria criteria = example.createCriteria();
		criteria.andOrgnaizationNameLike("%"+name+"%");
		List<Orgnaization> os = orgnaizationMapper.selectByExample(example);
		return os;
	}

	@Override
	public List<Orgnaization> findByProjectCode(String projectCode) {
		ProjectOrgnaizationExample example = new ProjectOrgnaizationExample();
		com.sc.pojo.ProjectOrgnaizationExample.Criteria c = example.createCriteria();
		c.andProjectCodeEqualTo(projectCode);
		List<ProjectOrgnaization> pos = projectOrgnaizationMapper.selectByExample(example );
		List<Orgnaization> os = new ArrayList<Orgnaization>();
		for(ProjectOrgnaization po : pos){
			Orgnaization o = orgnaizationMapper.selectByPrimaryKey(po.getOrganizationId());
			os.add(o);
		}
		return os;
	}

}
