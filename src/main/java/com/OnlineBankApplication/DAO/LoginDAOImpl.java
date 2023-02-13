package com.OnlineBankApplication.DAO;

import java.util.List;

import javax.persistence.Query;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.OnlineBankApplication.Entity.Registration;

@Component
public class LoginDAOImpl implements LoginDAO {
	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Autowired
	private SessionFactory sessionFactory;

	@Transactional
	public void register(Registration registration) {
		this.hibernateTemplate.save(registration);
	}

	@Override
	public boolean isUserIDExists(String userId) {
		System.out.println("LoginDAO");
		boolean userIdFound = false;
			Session session = sessionFactory.openSession();
			String SQL_QUERY =" from Registration as o where o.userId=userId";
			Query query = session.createQuery(SQL_QUERY);
			
			List<Registration> list = ((org.hibernate.query.Query) query).list();
			System.out.println(list);
			for(Registration registration: list) {
				System.out.println(registration.getUserId()==userId);
				if(userId.equals(registration.getUserId())) {
					userIdFound= true;
				}
			}
			return userIdFound;
		}
	

	@Override
	public boolean isPasswordExists(String password, String userId) {
		System.out.println("PasswordExists");
		boolean passwordFound = false;
		Session session = sessionFactory.openSession();
		String SQL_QUERY =" from Registration as o where o.password=password";
		Query query = session.createQuery(SQL_QUERY);
		List<Registration> list = ((org.hibernate.query.Query) query).list();
		System.out.println(list);
		for(Registration registration: list) {
			System.out.println("Password"+registration.getPassword());
			if(registration.getPassword().equals(password)) {
				passwordFound=true;
			}
		}
		return passwordFound;
	}

}
