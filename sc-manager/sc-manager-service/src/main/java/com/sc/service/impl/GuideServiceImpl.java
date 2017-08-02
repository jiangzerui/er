package com.sc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sc.mapper.GuideMapper;
import com.sc.pojo.Guide;
import com.sc.pojo.GuideExample;
import com.sc.pojo.GuideExample.Criteria;
import com.sc.service.GuideService;

@Service
public class GuideServiceImpl implements GuideService {
	@Autowired
	private GuideMapper guideMapper;
	
	@Override
	public Guide findByGuideCode(String guideCode) {
		GuideExample example = new GuideExample();
		Criteria c = example.createCriteria();
		c.andGuideCodeEqualTo(guideCode);
		List<Guide> gs = guideMapper.selectByExample(example );
		if(gs!=null && gs.size()>0){
			return gs.get(0);
		}
		return null;
	}

}
