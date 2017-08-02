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
}
