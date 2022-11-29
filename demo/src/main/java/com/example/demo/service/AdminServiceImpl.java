package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Admin;
import com.example.demo.repository.AdminRepository;

@Service
public class AdminServiceImpl implements AdminService {
	@Autowired
	AdminRepository adminRepository;

	@Override
	public boolean isUserNameExist(String userName) {
		Admin admin = adminRepository.findByUserName(userName);
		if (admin != null)
			return true;
		return false;
	}

	@Override
	public boolean isValidAdmin(String userName, String pass) {
		Admin admin = adminRepository.findByUserName(userName);
		String admin_repo_username = admin.getUserName();
		String admin_repo_pass = admin.getPassword();

		if (admin_repo_username.trim().equalsIgnoreCase(userName) && admin_repo_pass.equals(pass))
			return true;
		return false;
	}

}
