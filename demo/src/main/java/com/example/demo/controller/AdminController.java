package com.example.demo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.example.demo.model.User;
import com.example.demo.service.AdminService;

@Controller
@RequestMapping("/admin")
@SessionAttributes("uname")
public class AdminController {

	Logger logger = LoggerFactory.getLogger(UserController.class);

	@Autowired
	private AdminService adminService;

	@GetMapping(value = "/login")
	public String loginPage() {
		logger.info("<=====  LOGIN PAGE WILL BE RETURNED ===> ");
		return "admin/Login";

	}

	@PostMapping(value = "/dashboard")
	public String homePage(@RequestParam String userName, @RequestParam String pass, Model model) {
		if (adminService.isUserNameExist(userName)) {
			if (adminService.isValidAdmin(userName, pass)) {
				model.addAttribute("uname", userName);
				return "admin/Home";
			} else {
				model.addAttribute("login-message", "Sorry!! Username or Password is Incorrect!!");
				return "redirect:/admin/login";
			}
		}
		model.addAttribute("login-message", "Username does not exist!! Please Sign Up!!");
		return "redirect:/admin/login";
	}

	@GetMapping(value = "/dashboard")
	public String homePage1() {
		return "admin/Home";
	}

	@GetMapping(value = "/ComplaintList")
	public String ComplaintList() {
		return "admin/ComplaintList";
	}

	@GetMapping(value = "/DepartmentList")
	public String DepartmentList() {
		return "admin/DepartmentList";
	}

	@GetMapping(value = "/AdminUpdateComplaint")
	public String AdminUpdateComplaint() {
		return "admin/AdminUpdateComplaint";
	}

	@GetMapping(value = "/AddDepartment")
	public String AddDepartment() {
		return "admin/AddDepartment";
	}

	@PostMapping(value = "/add")
	public String addUser(@RequestBody User user) {
		String email = user.getEmail();
		String password = user.getPassword();
		String username = user.getUserName();
		String role = user.getRole();

		// adminService.saveUser(user);
		return "User has been saved!";
	}

	@GetMapping(value = "/logout")
	public String logoutPage(HttpServletRequest request, HttpServletResponse response) {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		if (auth != null) {
			new SecurityContextLogoutHandler().logout(request, response, auth);
		}
		return "redirect:/";
	}

}
