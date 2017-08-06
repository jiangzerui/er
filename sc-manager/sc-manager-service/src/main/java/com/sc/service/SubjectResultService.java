package com.sc.service;

import java.util.List;

import com.sc.pojo.SubjectResult;

public interface SubjectResultService {

	/**
	 * 提交阶段成果
	 * @param subjectResult
	 */
	public void saveSubjectResultService(SubjectResult subjectResult);

	/**
	 * 通过课题id，查找阶段成果列表
	 * @param subjectId
	 * @return
	 */
	public List<SubjectResult> findBySubjectId(int subjectId);
	
}

