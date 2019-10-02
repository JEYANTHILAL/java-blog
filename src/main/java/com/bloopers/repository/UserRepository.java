package com.bloopers.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bloopers.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	
	User findByName(String name);

}
