package com.nishant.DAO;

import org.springframework.stereotype.Service;

import com.nishant.model.User;


@Service
public interface UserDAO {

	public void insertuser( User user);
	public void test();
	
}
