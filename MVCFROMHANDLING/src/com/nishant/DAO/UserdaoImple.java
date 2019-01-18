package com.nishant.DAO;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nishant.model.User;

@Repository
public class UserdaoImple  implements UserDAO{

	
	@Autowired
	public SessionFactory sessionFactory; 
		
	@Override
	public void insertuser(User user) {
		//sessionFactory.getCurrentSession().saveOrUpdate(user);
		System.out.println(sessionFactory.getCurrentSession());
	}

	@Override
	@Transactional
	public void test() {
		System.out.println(sessionFactory.getCurrentSession());
		
	}

}
