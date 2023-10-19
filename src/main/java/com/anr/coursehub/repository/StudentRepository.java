package com.anr.coursehub.repository;

import com.anr.coursehub.model.StudentModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<StudentModel, Integer> {

}