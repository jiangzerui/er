package com.sc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sc.mapper.SubjectProfessionalMapper;
import com.sc.pojo.SubjectProfessional;
import com.sc.pojo.SubjectProfessionalExample;
import com.sc.pojo.SubjectProfessionalExample.Criteria;
import com.sc.service.SubjectProfessionalService;

@Service
public class SubjectProfessionalServiceImpl implements SubjectProfessionalService {

	@Autowired
	private SubjectProfessionalMapper spMapper;
	
	@Override
	public void changeSubjectProfessionalAllocation(int subjectId, int professionalId, boolean add) {
		if(add){
			SubjectProfessional record = new SubjectProfessional();
			record.setSubjectId(subjectId);
			record.setUserProfessionalId(professionalId);
			spMapper.insertSelective(record);
		}else{
			SubjectProfessionalExample example = new SubjectProfessionalExample();
			Criteria c = example.createCriteria();
			c.andSubjectIdEqualTo(subjectId).andUserProfessionalIdEqualTo(professionalId);
			spMapper.deleteByExample(example );
		}
	}

	@Override
	public List<SubjectProfessional> findBySubjectId(int subjectId) {
		SubjectProfessionalExample example = new SubjectProfessionalExample();
		Criteria c = example.createCriteria();
		c.andSubjectIdEqualTo(subjectId);
		return spMapper.selectByExample(example);
	}

}
