package com.welisonjoras.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.welisonjoras.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
