package com.Rest.RestWebService.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Rest.RestWebService.dao.CourseDao;
import com.Rest.RestWebService.entities.Course;

@Service
public class CourseServiceImpl implements CourseService{
	
//	List<Course> list;
	@Autowired
	private CourseDao courseDao;
	
	
	public CourseServiceImpl() {
//		list=new ArrayList<>();
//		list.add(new Course(145,"Java","Programing language3"));
//		list.add(new Course(146,"Python","Programing language1"));
//		list.add(new Course(147,"C++","Programing language2"));
//		// TODO Auto-generated constructor stub
	}

	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return courseDao.findAll();
	}

	@Override
	public Course getCourses(long courseId) {
		// TODO Auto-generated method stub
		
//		Course c = null;
//		
//		for(Course course:list) {
//			if(course.getId()==courseId) {
//				c=course;
//				break;
//			}
//		}
//		
		return courseDao.getOne(courseId);
	}

	@Override
	public Course addCourse(Course course) {
		// TODO Auto-generated method stub
		courseDao.save(course);
		return course;
	}

	@Override
	public Course updateCourse(Course course) {
		// TODO Auto-generated method stub
//		list.forEach(e -> {
//			if(e.getId()==course.getId()) {
//				e.setTitleString(course.getTitleString());
//				e.setDescription(course.getDescription());
//			}
//		});
		
		courseDao.save(course);
		return course;
		
	}

	@Override
	public void deleteCourse(long parseLong) {
		// TODO Auto-generated method stub
		//list=this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());
		Course entity=courseDao.getOne(parseLong);
		courseDao.delete(entity);
		
	}

}
