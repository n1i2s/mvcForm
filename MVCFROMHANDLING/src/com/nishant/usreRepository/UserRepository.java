package com.nishant.usreRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nishant.model.User;

public interface  UserRepository extends JpaRepository<User,Integer>{

}
 