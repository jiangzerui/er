package com.sc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sc.mapper.OrgnaizationMapper;
import com.sc.pojo.Orgnaization;
import com.sc.pojo.OrgnaizationExample;
import com.sc.pojo.OrgnaizationExample.Criteria;
import com.sc.service.OrgnaizationService;

@Service
public class OrgnaizationServiceImpl implements OrgnaizationService {
	@Autowired
	private OrgnaizationMapper orgnaizationMapper;
	
	@Override
	public List<Orgnaization> getByNameLike(String name) {
		OrgnaizationExample example = new OrgnaizationExample();
		Criteria criteria = example.createCriteria();
		criteria.andOrgnaizationNameLike("%"+name+"%");
		List<Orgnaization> os = orgnaizationMapper.selectByExample(example);
		return os;
	}

}
