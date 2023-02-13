package com.OnlineBankApplication.DAO;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.OnlineBankApplication.Entity.Transaction;


@Component
public class TransactionDAOImpl implements TransactionDAO {
	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	@Transactional
	public void saveTransaction(Transaction transaction) {
		this.hibernateTemplate.saveOrUpdate(transaction);
	}
	@Override
	public List<Transaction> getTransactions() {
		List<Transaction> allTransaction=this.hibernateTemplate.loadAll(Transaction.class);
		return allTransaction;
	}
	
	

	@Override
	public Transaction getTransaction(int tid) {
		return this.hibernateTemplate.get(Transaction.class,tid);
		
	}

	@Override
	@Transactional
	public void deleteTransaction(int tid) {
		Transaction transaction = this.hibernateTemplate.load(Transaction.class, tid);
		this.hibernateTemplate.delete(transaction);
		
	}
		
		
}
