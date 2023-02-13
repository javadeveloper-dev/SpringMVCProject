package com.OnlineBankApplication.Service;

import org.springframework.stereotype.Service;


public interface LoginService {
	public boolean Registration(String accountNo,String ifscCode,String userId,String password,String mobileNo);

	

	public boolean isUserIDExists(String userId);

	public boolean isPasswordExists(String password, String userId);



	public void register(com.OnlineBankApplication.Entity.Registration registration);



	public boolean isAccountNoValid(String accountNo);



	public boolean isIFSCCodeValid(String ifscCodeNo);



	public boolean isUserId(String userId);



	public boolean isPasswordValid(String password);



	public boolean isMobileNoValid(String mobileNo);

	
	
}
