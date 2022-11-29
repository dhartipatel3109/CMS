package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Dept;
import com.example.demo.repository.DeptRepository;

@Service
public class DeptServiceImpl implements DeptService {
	@Autowired
	DeptRepository deptRepository;

	@Override
	public boolean isUserNameExist(String userName) {
		Dept dept = deptRepository.findByUserName(userName);
		if (dept != null)
			return true;
		return false;
	}

	@Override
	public boolean isValidDept(String userName, String pass) {
		Dept dept = deptRepository.findByUserName(userName);
		String dept_repo_username = dept.getUserName();
		String dept_repo_pass = dept.getPassword();

		if (dept_repo_username.trim().equalsIgnoreCase(userName) && dept_repo_pass.equals(pass))
			return true;
		return false;
	}

}
