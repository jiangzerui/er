package com.sc.service;

import com.sc.pojo.Guide;

public interface GuideService {
	
	/**
	 * 通过指南code 查询指南信息
	 * @param guideCode
	 * @return
	 */
	public Guide findByGuideCode(String guideCode);
	
}
