package com.sc.service;

import java.util.List;

import com.sc.pojo.Guide;

public interface GuideService {
	
	/**
	 * 通过指南code 查询指南信息
	 * @param guideCode
	 * @return
	 */
	public Guide findByGuideCode(String guideCode);

	/**
	 * 通过项目code 查询所有指南
	 * @param projectCode
	 * @return
	 */
	public List<Guide> findByProjectCode(String projectCode);
	
}
