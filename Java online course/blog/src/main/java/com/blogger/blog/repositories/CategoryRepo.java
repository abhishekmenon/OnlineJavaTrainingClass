package com.blogger.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blogger.blog.entities.Category;

public interface CategoryRepo extends JpaRepository<Category,Integer>{

}
