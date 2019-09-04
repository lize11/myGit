package com.bw.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bw.entity.Student;
import com.bw.mapper.StuDao;

@Service
public class StuServiceImpl implements StuService{

	@Resource
	private StuDao dao;
	
	public List<Student> list() {
		return dao.list();
	}

}
