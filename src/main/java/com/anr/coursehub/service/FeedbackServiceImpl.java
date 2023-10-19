package com.anr.coursehub.service;

import com.anr.coursehub.repository.CourseRepository;
import com.anr.coursehub.repository.FeedbackRepository;
import com.anr.coursehub.repository.OrganizerRepository;
import com.anr.coursehub.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FeedbackServiceImpl implements FeedbackService {

    private final CourseRepository courseRepository;
    private final FeedbackRepository feedbackRepository;
    private final StudentRepository studentRepository;
    private final OrganizerRepository organizerRepository;

}
