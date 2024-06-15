package com.springbase.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbase.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
	

}
