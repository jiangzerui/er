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
	
	/**
	 * 通过专家id 查找分配给该专家的所有课题  未审批的
	 * @param userId
	 * @return
	 */
	public PageInfo<Subject> findUnReviewedSubjectsByProfessionalId(Integer userId, int page);

	/**
	 * 通过主键查询课题信息
	 * @param subjectId
	 * @return
	 */
	public Subject findSubjectById(int subjectId);
	
}
