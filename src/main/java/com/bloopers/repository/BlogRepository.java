package com.bloopers.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bloopers.entity.Blog;

public interface BlogRepository extends JpaRepository<Blog, Integer>{

}
