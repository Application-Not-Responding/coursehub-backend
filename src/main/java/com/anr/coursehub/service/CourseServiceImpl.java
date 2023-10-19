package com.anr.coursehub.service;

import com.anr.coursehub.model.CourseModel;
import com.anr.coursehub.model.OrganizerModel;
import com.anr.coursehub.repository.*;
import com.anr.openapi.model.NewCourseRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CourseServiceImpl implements CourseService {

    private final CourseRepository courseRepository;
    private final TopicRepository topicRepository;
    private final LessonRepository lessonRepository;
    private final StudentRepository studentRepository;
    private final OrganizerRepository organizerRepository;

    @Override
    public CourseModel addCourse(Integer organizerId, NewCourseRequest newCourseRequest){
        CourseModel courseModel = new CourseModel();
        courseModel.setName(newCourseRequest.getName());
        Optional<OrganizerModel> foundOrganizer = organizerRepository.findById(organizerId);
        OrganizerModel mockOrganizer = new OrganizerModel();
        mockOrganizer.setId(1);
        mockOrganizer.setUsername("Admin");
        courseModel.setOrganizer(foundOrganizer.orElse(mockOrganizer));
        courseModel.setName(newCourseRequest.getName());
        return courseRepository.save(courseModel);
    }

    @Override
    public CourseModel getCourseById(Integer courseId){
        return courseRepository.findById(courseId).orElseThrow();
    }

}
