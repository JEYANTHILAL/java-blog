package com.bloopers.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bloopers.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Integer>{

	Role findByName(String name);

}
