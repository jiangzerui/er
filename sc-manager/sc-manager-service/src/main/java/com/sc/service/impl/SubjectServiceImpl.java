package com.sc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.mapper.ProjectMapper;
import com.sc.mapper.SubjectMapper;
import com.sc.mapper.UserOrgnaizationMapper;
import com.sc.pojo.Project;
import com.sc.pojo.ProjectExample;
import com.sc.pojo.Subject;
import com.sc.pojo.SubjectExample;
import com.sc.pojo.UserOrgnaization;
import com.sc.pojo.UserOrgnaizationExample;
import com.sc.pojo.UserOrgnaizationExample.Criteria;
import com.sc.service.SubjectService;

@Service
public class SubjectServiceImpl implements SubjectService {
	@Autowired
	private SubjectMapper subjectMapper;
	@Autowired
	private UserOrgnaizationMapper userOrgnaizationMapper;
	@Autowired
	private ProjectMapper projectMapper; 
	
	@Value("${PAGE_SIZE}")
	private int pagesize;
	
	@Override
	public void saveSubject(Subject subject) {
		Project p = projectMapper.selectByPrimaryKey(subject.getProjectId());
		subject.setProjectName(p.getProjectName());
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
			c2.andSubjectStatusEqualTo(1);
			PageHelper.startPage(page, pagesize);
			List<Subject> subjects = subjectMapper.selectByExample(e2);
			PageInfo<Subject> pageInfo = new PageInfo<Subject>(subjects);
			return pageInfo;
		}else{
			return null;
		}
	}

}
