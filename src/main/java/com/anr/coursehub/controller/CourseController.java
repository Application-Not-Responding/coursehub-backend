package com.anr.coursehub.controller;

import com.anr.coursehub.mapper.CourseOpenApiMapper;
import com.anr.coursehub.model.CourseModel;
import com.anr.openapi.api.CourseApi;
import com.anr.openapi.model.Course;
import com.anr.openapi.model.NewCourseRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class CourseController implements CourseApi {

    private final CourseOpenApiMapper courseMapper;

    @Override
    public ResponseEntity<Course> createCourse(NewCourseRequest newCourseRequest) {
        CourseModel course = new CourseModel(1, newCourseRequest.getName(), "abobasdfasda");
        return ResponseEntity.ok(courseMapper.fromEntityToOpenApi(course));
    }

    @Override
    public ResponseEntity<Course> getCourseById(Integer id) {
        CourseModel course = new CourseModel(1, "Abaoba", "avav");
        return ResponseEntity.ok(courseMapper.fromEntityToOpenApi(course));
    }
}
