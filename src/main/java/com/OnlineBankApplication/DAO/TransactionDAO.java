package com.OnlineBankApplication.DAO;

import java.util.List;

import com.OnlineBankApplication.Entity.Transaction;

public interface TransactionDAO {
	public void saveTransaction(Transaction transaction);

	public List<Transaction> getTransactions();

	public Transaction getTransaction(int tid);

	public void deleteTransaction(int tid);
}
