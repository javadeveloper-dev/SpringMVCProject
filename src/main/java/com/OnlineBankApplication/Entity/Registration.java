	package com.OnlineBankApplication.Entity;
	
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	
	@Entity
	public class Registration {
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private int id;
		private String userId;
		private String accountNo;
		private String ifscCodeNo;
		private String password;
		private String mobileNo;
	
		public String getUserId() {
			return userId;
		}
	
		public void setUserId(String userId) {
			this.userId = userId;
		}
	
		
	
		public String getAccountNo() {
			return accountNo;
		}
	
		public void setAccountNo(String accountNo) {
			this.accountNo = accountNo;
		}
	
		public String getIfscCodeNo() {
			return ifscCodeNo;
		}
	
		public void setIfscCodeNo(String ifscCodeNo) {
			this.ifscCodeNo = ifscCodeNo;
		}
	
		public String getPassword() {
			return password;
		}
	
		public void setPassword(String password) {
			this.password = password;
		}
	
		public String getMobileNo() {
			return mobileNo;
		}
	
		public void setMobileNo(String mobileNo) {
			this.mobileNo = mobileNo;
		}
	
		

		public Registration(int id, String userId, String accountNo, String ifscCodeNo, String password,
				String mobileNo) {
			super();
			this.id = id;
			this.userId = userId;
			this.accountNo = accountNo;
			this.ifscCodeNo = ifscCodeNo;
			this.password = password;
			this.mobileNo = mobileNo;
		}
		

		public Registration(String userId, String accountNo, String ifscCodeNo, String password, String mobileNo) {
			super();
			this.userId = userId;
			this.accountNo = accountNo;
			this.ifscCodeNo = ifscCodeNo;
			this.password = password;
			this.mobileNo = mobileNo;
		}
		
		public Registration() {
			super();
		}

		@Override
		public String toString() {
			return "Registration [userId=" + userId + ", accountNo=" + accountNo + ", ifscCodeNo=" + ifscCodeNo
					+ ", password=" + password + ", mobileNo=" + mobileNo + "]";
		}
	
	}
