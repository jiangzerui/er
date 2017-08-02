package com.sc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sc.mapper.SubjectMapper;
import com.sc.pojo.Subject;
import com.sc.service.SubjectService;

@Service
public class SubjectServiceImpl implements SubjectService {
	@Autowired
	private SubjectMapper subjectMapper;
	
	@Override
	public void saveSubject(Subject subject) {
		subjectMapper.insert(subject);
	}

}
