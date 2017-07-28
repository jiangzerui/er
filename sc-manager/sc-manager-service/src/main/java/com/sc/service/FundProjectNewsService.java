package com.sc.service;

import java.util.List;

import com.sc.pojo.FundProjectNews;

public interface FundProjectNewsService {
	
	/**
	 * 通过项目id  查询该项目的新闻列表
	 * @param projectId
	 * @return
	 */
	public List<FundProjectNews> findByProjectId(int projectId);
	
}
