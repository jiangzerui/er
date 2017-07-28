package com.sc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sc.mapper.FundProjectNewsMapper;
import com.sc.pojo.FundProjectNews;
import com.sc.pojo.FundProjectNewsExample;
import com.sc.pojo.FundProjectNewsExample.Criteria;
import com.sc.service.FundProjectNewsService;

@Service
public class FundProjectNewsServiceImpl implements FundProjectNewsService {
	@Autowired
	private FundProjectNewsMapper fundProjectNewsMapper;
	
	@Override
	public List<FundProjectNews> findByProjectId(int projectId) {
		FundProjectNewsExample example = new FundProjectNewsExample();
		Criteria c = example.createCriteria();
		c.andFundProjectIdEqualTo(projectId);
		List<FundProjectNews> ps = fundProjectNewsMapper.selectByExample(example );
		return ps;
	}

}
