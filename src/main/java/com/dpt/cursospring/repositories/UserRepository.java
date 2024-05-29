package com.dpt.cursospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dpt.cursospring.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
