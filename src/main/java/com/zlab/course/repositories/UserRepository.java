package com.zlab.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zlab.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
