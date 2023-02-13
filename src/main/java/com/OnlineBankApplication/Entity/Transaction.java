package com.OnlineBankApplication.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class Transaction {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int transactionId;
	private String accountNo;
	private String name;
	private String emailId;
	private String transactionType;
	private String phoneNo;
	private String amount;
	
	
	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public int getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	

	public Transaction(int transactionId, String accountNo, String name, String emailId, String transactionType,
			String phoneNo, String amount) {
		super();
		this.transactionId = transactionId;
		this.accountNo = accountNo;
		this.name = name;
		this.emailId = emailId;
		this.transactionType = transactionType;
		this.phoneNo = phoneNo;
		this.amount = amount;
	}

	public Transaction() {
		super();
	}

	@Override
	public String toString() {
		return "Transaction [transactionId=" + transactionId + ", accountNo=" + accountNo + ", name=" + name
				+ ", emailId=" + emailId + ", transactionType=" + transactionType + ", phoneNo=" + phoneNo + ", amount="
				+ amount + "]";
	}
	

}