package com.sc.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.mapper.ProjectMapper;
import com.sc.mapper.SubjectMapper;
import com.sc.mapper.SubjectProfessionalMapper;
import com.sc.mapper.UserOrgnaizationMapper;
import com.sc.pojo.Project;
import com.sc.pojo.ProjectExample;
import com.sc.pojo.Subject;
import com.sc.pojo.SubjectExample;
import com.sc.pojo.SubjectProfessional;
import com.sc.pojo.SubjectProfessionalExample;
import com.sc.pojo.UserOrgnaization;
import com.sc.pojo.UserOrgnaizationExample;
import com.sc.pojo.UserOrgnaizationExample.Criteria;
import com.sc.service.SubjectService;

@Service
public class SubjectServiceImpl implements SubjectService {
	@Autowired
	private SubjectMapper subjectMapper;
	@Autowired
	private SubjectProfessionalMapper spMapper;
	@Autowired
	private UserOrgnaizationMapper userOrgnaizationMapper;
	@Autowired
	private ProjectMapper projectMapper; 
	
	@Value("${PAGE_SIZE}")
	private int pagesize;
	@Value("${SUBJECT_STATUS_SENDED}")
	private int SUBJECT_STATUS_SENDED;
	@Value("${SUBJECT_STATUS_CHECKING}")
	private int SUBJECT_STATUS_CHECKING;
	@Value("${SUBJECT_STATUS_ORGNAIZATION_CHECKING}")
	private int SUBJECT_STATUS_ORGNAIZATION_CHECKING;
	@Value("${SUBJECT_STATUS_ORGNAIZATION_PASSED}")
	private int SUBJECT_STATUS_ORGNAIZATION_PASSED;
	@Value("${SUBJECT_STATUS_APPROVALED}")
	private int SUBJECT_STATUS_APPROVALED;
	@Value("${SUBJECT_STATUS_DONE}")
	private int SUBJECT_STATUS_DONE;
	@Value("${SUBJECT_STATUS_UNPASSED}")
	private int SUBJECT_STATUS_UNPASSED;
	@Override
	public void saveSubject(Subject subject) {
		Project p = projectMapper.selectByPrimaryKey(subject.getProjectId());
		subject.setProjectName(p.getProjectName());
		subject.setPmCheckStatus(0);
		subjectMapper.insert(subject);
	}

	@Override
	public PageInfo<Subject> findSubjectByOrgUserId(Integer userId, int page) {
		//通过userid查询该用户的组织id
		UserOrgnaizationExample example = new UserOrgnaizationExample();
		Criteria c = example.createCriteria();
		c.andUserIdEqualTo(userId);
		List<UserOrgnaization> uos = userOrgnaizationMapper.selectByExample(example );
		if(uos!=null && uos.size()>0){
			UserOrgnaization uo = uos.get(0);
			int orgId = uo.getOrgnaizationId();
			//通过组织id，查询可审核的课题列表
			SubjectExample e2 = new SubjectExample();
			com.sc.pojo.SubjectExample.Criteria c2 = e2.createCriteria();
			c2.andOrgIdEqualTo(orgId);
			c2.andSubjectStatusEqualTo(SUBJECT_STATUS_SENDED);
			PageHelper.startPage(page, pagesize);
			List<Subject> subjects = subjectMapper.selectByExample(e2);
			PageInfo<Subject> pageInfo = new PageInfo<Subject>(subjects);
			return pageInfo;
		}else{
			return null;
		}
	}

	@Override
	public void updateSubjectStatus(Subject subject) {
		subjectMapper.updateByPrimaryKeySelective(subject);
	}

	@Override
	public PageInfo<Subject> findSubjectByPmUserId(Integer userId, int page) {
		//通过pmid，查询可审核的课题列表
		SubjectExample e2 = new SubjectExample();
		com.sc.pojo.SubjectExample.Criteria c2 = e2.createCriteria();
		c2.andPmIdEqualTo(userId);
		c2.andSubjectStatusGreaterThanOrEqualTo(SUBJECT_STATUS_ORGNAIZATION_PASSED);
		PageHelper.startPage(page, pagesize);
		List<Subject> subjects = subjectMapper.selectByExample(e2);
		PageInfo<Subject> pageInfo = new PageInfo<Subject>(subjects);
		return pageInfo;
	}

	@Override
	public PageInfo<Subject> findUnReviewedSubjectsByProfessionalId(Integer userId, int page) {
		//通过pmid，查询可审核的课题列表
		SubjectProfessionalExample e = new SubjectProfessionalExample();
		com.sc.pojo.SubjectProfessionalExample.Criteria c = e.createCriteria();
		c.andUserProfessionalIdEqualTo(userId).andReviewedEqualTo(0);
		PageHelper.startPage(page, pagesize);
		List<SubjectProfessional> sps = spMapper.selectByExample(e);
		List<Subject> ss = new ArrayList<Subject>();
		for(SubjectProfessional sp : sps){
			ss.add(subjectMapper.selectByPrimaryKey(sp.getSubjectId()));
		}
		PageInfo<Subject> pageInfo = new PageInfo<Subject>(ss);
		return pageInfo;
	}

	@Override
	public Subject findSubjectById(int subjectId) {
		return subjectMapper.selectByPrimaryKey(subjectId);
	}

	@Override
	public PageInfo<Subject> findSubjectByPmAndStatus(Integer userId, int page) {
		SubjectExample example = new SubjectExample();
		com.sc.pojo.SubjectExample.Criteria criteria = example.createCriteria();
		criteria.andPmIdEqualTo(userId).andPmCheckStatusEqualTo(0);
		PageHelper.startPage(page, pagesize);
		List<Subject> subjects = subjectMapper.selectByExample(example );
		PageInfo<Subject> pageInfo = new PageInfo<Subject>(subjects);
		return pageInfo;
	}

	@Override
	public PageInfo<Subject> findSubjectByUserId(Integer userId, int page) {
		SubjectExample example = new SubjectExample();
		com.sc.pojo.SubjectExample.Criteria criteria = example.createCriteria();
		criteria.andUserIdEqualTo(userId);
		PageHelper.startPage(page, pagesize);
		List<Subject> subjects = subjectMapper.selectByExample(example );
		PageInfo<Subject> pageInfo = new PageInfo<Subject>(subjects);
		return pageInfo;
	}

	@Override
	public Integer getAllSubject() {
		// TODO Auto-generated method stub
		int sc = (int) subjectMapper.countByExample(null);
		return sc;
	}

}







