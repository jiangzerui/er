package com.sc.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.sc.pojo.Subject;
import com.sc.pojo.SubjectProfessional;

public interface SubjectProfessionalService {
	
	/**
	 * 修改课题 专家分配状态
	 * @param subjectId
	 * @param professionalId
	 * @param add   true:把该课题分配给这个专家   false：取消该课题分配给这个专家
	 */
	public void changeSubjectProfessionalAllocation(int subjectId, int professionalId, boolean add);
	
	/**
	 * 通过课题id，查找已分配的专家id
	 * @param subjectId
	 * @return
	 */
	public List<SubjectProfessional> findBySubjectId(int subjectId);

	/**
	 * 更新审核表
	 * @param subjectProfessional
	 */
	public void updateReviewSubject(SubjectProfessional subjectProfessional);

	/**
	 * 通过主键查询课题专家中间表的数据 
	 * @param subjectProfessionalId
	 * @return
	 */
	public SubjectProfessional selectBySubjectProfessionalId(int subjectProfessionalId);
	
}
