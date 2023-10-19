package com.anr.coursehub.service;

import com.anr.coursehub.model.CourseModel;
import com.anr.openapi.model.NewCourseRequest;

public interface CourseService {

    CourseModel addCourse(Integer organizerId, NewCourseRequest newCourseRequest);

    CourseModel getCourseById(Integer courseId);


}
