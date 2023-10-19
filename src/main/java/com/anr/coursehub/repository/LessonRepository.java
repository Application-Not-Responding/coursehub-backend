package com.anr.coursehub.repository;

import com.anr.coursehub.model.LessonModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LessonRepository extends JpaRepository<LessonModel, Integer> {

}