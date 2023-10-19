package com.anr.coursehub.repository;

import com.anr.coursehub.model.FeedbackModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FeedbackRepository extends JpaRepository<FeedbackModel, Integer> {

}