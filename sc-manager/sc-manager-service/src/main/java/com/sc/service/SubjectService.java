package com.sc.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.sc.pojo.Subject;

public interface SubjectService {

	/**
	 * 提交课题
	 * @param subject
	 */
	public void saveSubject(Subject subject);

	/**
	 * 通过组织用户id  查询可审批的课题列表
	 * @param userId
	 * @return
	 */
	public PageInfo<Subject> findSubjectByOrgUserId(Integer userId, int page);

	/**
	 * 通过项目经理用户id  查询可分配的课题列表
	 * @param userId
	 * @return
	 */
	public PageInfo<Subject> findSubjectByPmUserId(Integer userId, int page);

	/**
	 * 修改课题的状态
	 * @param subject
	 */
	public void updateSubjectStatus(Subject subject);
	
}
