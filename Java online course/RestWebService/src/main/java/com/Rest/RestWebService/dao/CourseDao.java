package com.Rest.RestWebService.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Rest.RestWebService.entities.Course;

@Repository
public interface CourseDao extends JpaRepository<Course,Long>{

}
