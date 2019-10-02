package com.bloopers.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bloopers.entity.Blog;
import com.bloopers.entity.User;

public interface BlogRepository extends JpaRepository<Blog, Integer>{
	List<Blog> findByUser(User user);
}
