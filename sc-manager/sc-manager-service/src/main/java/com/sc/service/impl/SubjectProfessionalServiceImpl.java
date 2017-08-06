package com.sc.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageInfo;
import com.sc.mapper.OrgnaizationMapper;
import com.sc.mapper.ProfessorMapper;
import com.sc.mapper.SubjectMapper;
import com.sc.mapper.SubjectProfessionalMapper;
import com.sc.pojo.Orgnaization;
import com.sc.pojo.Professor;
import com.sc.pojo.Subject;
import com.sc.pojo.SubjectProfessional;
import com.sc.pojo.SubjectProfessionalExample;
import com.sc.pojo.SubjectProfessionalExample.Criteria;
import com.sc.service.SubjectProfessionalService;

@Service
public class SubjectProfessionalServiceImpl implements SubjectProfessionalService {

	@Autowired
	private SubjectProfessionalMapper spMapper;
	@Autowired
	private ProfessorMapper professorMapper;
	@Autowired
	private SubjectMapper subjectMapper;
	@Autowired
	private OrgnaizationMapper orgnaizationMapper;
	
	
	@Override
	public void changeSubjectProfessionalAllocation(int subjectId, int professionalId, boolean add) {
		if(add){
			SubjectProfessional record = new SubjectProfessional();
			record.setSubjectId(subjectId);
			record.setUserProfessionalId(professionalId);
			//查询专家的名字 缓存到数据库  
			Professor professor = professorMapper.selectByPrimaryKey(professionalId);
			record.setProfessionalName(professor.getName());
			//组织的名字
			Subject subject = subjectMapper.selectByPrimaryKey(subjectId);
			int orgId = subject.getOrgId();
			Orgnaization org = orgnaizationMapper.selectByPrimaryKey(orgId);
			record.setOrgnaizationName(org.getOrgnaizationName());
			record.setReviewed(0);
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

	@Override
	public void updateReviewSubject(SubjectProfessional subjectProfessional) {
		SubjectProfessionalExample example = new SubjectProfessionalExample();
		Criteria c = example.createCriteria();
		c.andUserProfessionalIdEqualTo(subjectProfessional.getUserProfessionalId())
			.andSubjectIdEqualTo(subjectProfessional.getSubjectId());
		subjectProfessional.setCreateTime(new Date());
		spMapper.updateByExampleSelective(subjectProfessional, example);
		
	}

	@Override
	public SubjectProfessional selectBySubjectProfessionalId(int subjectProfessionalId) {
		return spMapper.selectByPrimaryKey(subjectProfessionalId);
	}

}
