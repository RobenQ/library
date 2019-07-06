package com.library.controller;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.library.bean.Admin;
import com.library.bean.User;
import com.library.service.AdminService;
import com.library.service.UserService;
import com.library.utils.Util_1;

@Controller
public class LoginController {
	@Autowired
	private AdminService adminService;
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="login",method=RequestMethod.POST)
	public void login(HttpServletRequest request,HttpServletResponse response) throws IOException {
		String account = request.getParameter("account");
		String pwd = request.getParameter("pwd");
		String pwd2 = null;
		try {
			pwd2 = Util_1.sHAEncrypt(pwd);
		} catch (NoSuchAlgorithmException e) {
			response.getWriter().write("error");
			e.printStackTrace();
		}
		User user = userService.selByAccountAndPwd(account, pwd2);
		Admin admin = adminService.selByAccountAndPwd(account, pwd2);
		if ((user!=null)&&(admin==null)) {
			HttpSession session = request.getSession();
			session.setAttribute("user", user);
			response.getWriter().write("user");
		} else if ((user==null)&&(admin!=null)){
			HttpSession session = request.getSession();
			session.setAttribute("admin", admin);
			response.getWriter().write("admin");
		}else if ((user==null)&&(admin==null)){
			response.getWriter().write("error");
		}
	}
}
