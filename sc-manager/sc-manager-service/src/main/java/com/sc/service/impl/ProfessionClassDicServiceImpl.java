package com.sc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sc.mapper.ProfessionClassDicMapper;
import com.sc.pojo.ProfessionClassDic;
import com.sc.service.ProfessionClassDicService;

@Service
public class ProfessionClassDicServiceImpl implements ProfessionClassDicService {
	@Autowired
	private ProfessionClassDicMapper pfcMapper;
	
	@Override
	public List<ProfessionClassDic> getAll() {
		return pfcMapper.selectByExample(null);
	}

}
