package com.anr.coursehub.repository;

import com.anr.coursehub.model.CourseModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<CourseModel, Integer> {



}