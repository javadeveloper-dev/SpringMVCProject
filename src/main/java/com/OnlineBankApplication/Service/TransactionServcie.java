package com.OnlineBankApplication.Service;

import java.util.List;

import com.OnlineBankApplication.Entity.Transaction;

public interface TransactionServcie {

	boolean isValidAccountNo(String accountNo);
	boolean isValidName(String name);
	boolean isValidPhoneNo(String phoneNo);
	boolean isValidAmount(String string);
	void saveTransaction(Transaction transaction);
	List<Transaction> getTransactions();
	void deleteTransaction(int tid);
}
