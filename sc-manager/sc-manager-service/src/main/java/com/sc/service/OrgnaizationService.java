package com.sc.service;

import java.util.List;

import com.sc.pojo.Orgnaization;

public interface OrgnaizationService {
	/**
	 * 通过名称模糊查询
	 * @param name
	 * @return
	 */
	public List<Orgnaization> getByNameLike(String name);

	/**
	 * 通过项目 获取组织
	 * @param projectCode
	 */
	public List<Orgnaization> findByProjectCode(String projectCode);

	/**
	 * 通过主键查询组织信息
	 * @param orgId
	 * @return
	 */
	public Orgnaization findById(int orgId);
	
	/**
	 * 找到所有的组织
	 */
	public Integer getAllOrgnaizations();
}
