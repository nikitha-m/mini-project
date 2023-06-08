package com.springboot.REST.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.REST.entity.Course;

public interface CourseDao extends JpaRepository<Course , Long> {

}
