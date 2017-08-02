package com.sc.service;

import java.util.List;

import com.sc.pojo.Guide;
import com.sc.pojo.Project;

public interface ProjectService {
	
	/**
	 * 通过主键查询项目
	 * @param projectId
	 * @return
	 */
	public Project getProjectById(int projectId);
	
	/**
	 * 获取zb平台主页中需要显示的项目列表，默认显示最新提交的10个项目。
	 * @return
	 */
	public List<Project> getIndexProjectList();
	
	/**
	 * 发布项目
	 */
	public void saveProject(Project project, Guide guide, String orgs);
	
}
