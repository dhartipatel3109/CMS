package com.example.demo.service;

public interface AdminService {

	boolean isUserNameExist(String userName);

	boolean isValidAdmin(String userName, String pass);

}
