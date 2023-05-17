package com.blogger.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blogger.blog.entities.User;

public interface UserRepo extends JpaRepository<User,Integer>{

}
