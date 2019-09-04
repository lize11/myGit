package com.bw.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bw.entity.Student;
import com.bw.service.StuService;

@Controller
public class StuController {
	
	@Resource
	private StuService service;
	
	@RequestMapping("list.do")
	public String list(Model model){
		
		List<Student> list = service.list();
		model.addAttribute("list", list);
		return "list";
	}
	
}
