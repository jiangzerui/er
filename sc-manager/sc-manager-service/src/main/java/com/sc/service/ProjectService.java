package com.sc.service;

import java.util.List;

import com.sc.pojo.Project;

public interface ProjectService {
	
	/**
	 * 获取zb平台主页中需要显示的项目列表，默认显示最新提交的10个项目。
	 * @return
	 */
	public List<Project> getIndexProjectList();
	
}
