package com.OnlineBankApplication.Controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import com.OnlineBankApplication.DAO.LoginDAO;
import com.OnlineBankApplication.DAO.LoginDAOImpl;
import com.OnlineBankApplication.Entity.Registration;
import com.OnlineBankApplication.Service.LoginService;
import com.OnlineBankApplication.Service.LoginServiceImpl;

@Controller
public class LoginController {

	
	@Autowired
	private LoginService loginService;

	@RequestMapping("/")
	public String home() {
		return "index";
	}

	@RequestMapping("/signIn")
	public String signIn() {
		return "SignIn";
	}

	@RequestMapping("/registration")
	public String registraion() {
		return "Registration";
	}
	
//	@RequestMapping("/logOut")
//	public String logOut() {
//		return 
//	}

	@RequestMapping("/handle-registration")
	public String handleRegistration(@ModelAttribute Registration registration, HttpServletRequest request,
			Model model) {
		boolean flag=true;
			if(loginService.isAccountNoValid(registration.getAccountNo())==false) {
				model.addAttribute("accountNo","");
				model.addAttribute("accountNoMessege", "Enter Valid Account No");
				flag=false;
			}else {
				model.addAttribute("accountNo",registration.getAccountNo());
				
			}
			if(loginService.isIFSCCodeValid(registration.getIfscCodeNo())==false) {
				model.addAttribute("ifscCode","");
				model.addAttribute("ifscCodeMessege","Enter the Valid IFSC Code ");
				flag=false;
			}else {
				model.addAttribute("ifscCode",registration.getIfscCodeNo());
			}
			System.out.println(loginService.isUserId(registration.getUserId())==false);
			if(loginService.isUserId(registration.getUserId())==false) {
				
				model.addAttribute("userId","");
				model.addAttribute("userIdMessege","Enter the Valid User Id");
				flag=false;
			}else {
				model.addAttribute("userId",registration.getUserId());
			}
			if(loginService.isPasswordValid(registration.getPassword())==false) {
				model.addAttribute("password","");
				model.addAttribute("passwordMessege","Enter the Valid Password ");
				flag=false;
			}else {
				model.addAttribute("password",registration.getPassword());
			}
			if(loginService.isMobileNoValid(registration.getMobileNo())==false) {
				model.addAttribute("mobileNo","");
				model.addAttribute("mobileNoMessege","Enter the Valid Mobile No ");
				flag=false;
			} {
				model.addAttribute("mobileNo",registration.getMobileNo());
			}
			if(flag) {
			model.addAttribute("registrationSuccessfull","Registration is Successfull...");
			loginService.register(registration);
			return "Welcome";
			}else {
				return "Registration";
			}
	}

	@RequestMapping("/handle-signIn")
	public String signInUser(@RequestParam("userId") String userId, @RequestParam("password") String password,
			Model model) {
		boolean flag = true;
			if (loginService.isUserIDExists(userId) == false) {
				model.addAttribute("userIdMessege", "Enter Valid User Id");
				flag = false;
			}else {
				model.addAttribute("userId",userId);
			}
			
			if (loginService.isPasswordExists(password,userId) == false) {
				model.addAttribute("passwordMessege", "Enter the valid Password");
				flag = false;
			}else {
				model.addAttribute("password",password);
			}
			if (flag) {
				return "Welcome";
			}else {
				return "SignIn";
			}
	}
	
	
}
