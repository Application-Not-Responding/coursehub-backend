package com.anr.coursehub.repository;

import com.anr.coursehub.model.TopicModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicRepository extends JpaRepository<TopicModel, Integer> {

}