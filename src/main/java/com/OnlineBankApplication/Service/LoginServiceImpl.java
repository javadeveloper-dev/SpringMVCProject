package com.OnlineBankApplication.Service;
import java.util.regex.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.OnlineBankApplication.DAO.LoginDAO;
import com.OnlineBankApplication.DAO.LoginDAOImpl;
@Service
public class LoginServiceImpl implements LoginService  {
	
private final String regexForAccountNo = "^[0-9]{11,16}$";
private final String regexForIfscCode ="^[A-Z]{4}[0-9]{7}$";
private final String regexForUserId="^[0-9]{6}$";
private final String regexForPassword="(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{6,11}";
private final String regexForMobileNo="(0/91)?[7-9][0-9]{9}";
	
	@Autowired
	private LoginDAO loginDAO;
	
	public boolean Registration(String accountNo, String ifscCode, String userId, String password, String mobileNo) {
		
		if(Pattern.matches(regexForAccountNo, accountNo) && Pattern.matches(regexForIfscCode, ifscCode) && Pattern.matches(regexForUserId,userId) && Pattern.matches("regexForPassword",password) && Pattern.matches("regexForMobileNo",mobileNo)) {
			com.OnlineBankApplication.Entity.Registration registration=new com.OnlineBankApplication.Entity.Registration( userId,  ifscCode,  accountNo,  password,  mobileNo);
			loginDAO.register(registration);
			return true;
		}
		return false;
	}
	
	@Override
	public boolean isUserIDExists(String userId) {
		if(Pattern.matches(regexForUserId, userId)) {
			loginDAO.isUserIDExists(userId);
			return true;
		}
		return false;
	}
	
	@Override
	public boolean isPasswordExists(String password, String userId) {
		String userIdForValidation=String.valueOf(userId);
		if(Pattern.matches(regexForPassword, password)) {
			loginDAO.isPasswordExists(password, userId);
			return true;
		}
		return false;
	}

	@Override
	public void register(com.OnlineBankApplication.Entity.Registration registration) {
		loginDAO.register(registration);
		
	}

	@Override
	public boolean isAccountNoValid(String accountNo) {
		if(!Pattern.matches(regexForAccountNo, accountNo)) {
			return false;
		}
		return true;
	}

	@Override
	public boolean isIFSCCodeValid(String ifscCodeNo) {
		if(!Pattern.matches(regexForIfscCode, ifscCodeNo)) {
			return false;
		}
		return true;
	}

	@Override
	public boolean isUserId(String userId) {
		if(!Pattern.matches(regexForUserId, userId)) {
			return false;
		}
		return true;
	}

	@Override
	public boolean isPasswordValid(String password) {
		if(!Pattern.matches(regexForPassword, password)) {
			return false;
		}
		return true;
	}

	@Override
	public boolean isMobileNoValid(String mobileNo) {
		System.out.println("Mobile NO"+Pattern.matches(regexForMobileNo, mobileNo));
		if(!Pattern.matches(regexForMobileNo, mobileNo)) {
			return false;
		}
		return true;
	}
	

}
