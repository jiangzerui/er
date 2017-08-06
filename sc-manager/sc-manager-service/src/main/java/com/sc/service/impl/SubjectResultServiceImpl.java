package com.sc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sc.mapper.SubjectResultMapper;
import com.sc.pojo.SubjectResult;
import com.sc.pojo.SubjectResultExample;
import com.sc.pojo.SubjectResultExample.Criteria;
import com.sc.service.SubjectResultService;

@Service
public class SubjectResultServiceImpl implements SubjectResultService {

	@Autowired
	private SubjectResultMapper srMapper;
	
	@Override
	public void saveSubjectResultService(SubjectResult subjectResult) {
		srMapper.insert(subjectResult);
	}

	@Override
	public List<SubjectResult> findBySubjectId(int subjectId) {
		SubjectResultExample example = new SubjectResultExample();
		Criteria c = example.createCriteria();
		c.andSubjectIdEqualTo(subjectId);
		return srMapper.selectByExample(example );
	}

}
