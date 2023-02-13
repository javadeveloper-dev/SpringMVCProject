package com.OnlineBankApplication.Service;

import java.util.List;
import java.util.regex.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.OnlineBankApplication.DAO.TransactionDAO;
import com.OnlineBankApplication.Entity.Transaction;

@Service
public class TransactionServiceImpl implements TransactionServcie {
	private final String regexForAccountNo = "^[0-9]{11,16}$";
	private final String regexForFullName = "^[A-Z]+[a-z]{2,6}\\s[A-Z]+[a-z]{2,10}\\s[A-Z]+[a-z]{2,10}$";
	private final String regexForPhoneNo = "(0/91)?[7-9][0-9]{9}";
	private final String regexForAmount = "^[0-9]*{3,9}$";

	@Autowired
	private TransactionDAO transactionDAO;

	public boolean isValidAccountNo(String accountNo) {
		if (!Pattern.matches(regexForAccountNo, accountNo)) {
			return false;
		} else {
			return true;
		}
	}

	public boolean isValidName(String name) {
		if (!Pattern.matches(regexForFullName, name)) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public boolean isValidPhoneNo(String phoneNo) {
		if (!Pattern.matches(regexForPhoneNo, phoneNo)) {
			return false;
		}
		return true;
	}

	@Override
	public boolean isValidAmount(String amount) {
		if (!Pattern.matches(regexForAmount, amount)) {
			return false;
		}
		return true;
	}

	@Override
	public void saveTransaction(Transaction transaction) {
		transactionDAO.saveTransaction(transaction);

	}

	@Override
	public List<Transaction> getTransactions() {
		return transactionDAO.getTransactions();
	}

	@Override
	public void deleteTransaction(int tid) {
		transactionDAO.deleteTransaction(tid);

	}

}
