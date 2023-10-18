package com.anr.coursehub.controller;

import com.anr.coursehub.mapper.CourseOpenApiMapper;
import com.anr.coursehub.model.CourseModel;
import com.anr.openapi.api.CoursesApi;
import com.anr.openapi.model.*;
import com.anr.openapi.model.Course;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
@RequiredArgsConstructor
public class CourseController implements CoursesApi {

    private final CourseOpenApiMapper courseMapper;

    @Override
    public ResponseEntity<Course> addCourse(Integer organizerId, NewCourseRequest newCourseRequest) {
        CourseModel course = new CourseModel(1, newCourseRequest.getName(), organizerId);
        return ResponseEntity.ok(courseMapper.fromEntityToOpenApi(course));
    }

    @Override
    public ResponseEntity<Course> addCourseToActive(Integer studentId, Course course) {
        return CoursesApi.super.addCourseToActive(studentId, course);
    }

    @Override
    public ResponseEntity<Void> addLessonInTopic(String courseId, String topicId, Lesson lesson) {
        return CoursesApi.super.addLessonInTopic(courseId, topicId, lesson);
    }

    @Override
    public ResponseEntity<Void> addMaterialInLesson(String courseId, String topicId, String lessonId, String body) {
        return CoursesApi.super.addMaterialInLesson(courseId, topicId, lessonId, body);
    }

    @Override
    public ResponseEntity<Void> addTopic(String courseId, Topic topic) {
        return CoursesApi.super.addTopic(courseId, topic);
    }

    @Override
    public ResponseEntity<Void> deleteCourseById(String organizerId, String courseId) {
        return CoursesApi.super.deleteCourseById(organizerId, courseId);
    }

    @Override
    public ResponseEntity<Void> editCourse(String organizerId, String courseId) {
        return CoursesApi.super.editCourse(organizerId, courseId);
    }

    @Override
    public ResponseEntity<List<Course>> getCourseById(Integer courseId) {
        CourseModel course = new CourseModel(courseId, "Abaoba", 1);
        List<Course> coursesList = new ArrayList<Course>();
        coursesList.add(courseMapper.fromEntityToOpenApi(course));
        return ResponseEntity.ok(coursesList);
    }

    @Override
    public ResponseEntity<List<Course>> getCoursesByName(String name, String filter) {
        return CoursesApi.super.getCoursesByName(name, filter);
    }

    @Override
    public ResponseEntity<String> getMaterialsByTopicIdAndLessonId(String topicId, String lessonId) {
        return CoursesApi.super.getMaterialsByTopicIdAndLessonId(topicId, lessonId);
    }

    @Override
    public ResponseEntity<String> getStatisticsByOrganizerId(String organizerId, String courseId) {
        return CoursesApi.super.getStatisticsByOrganizerId(organizerId, courseId);
    }

    @Override
    public ResponseEntity<Topic> getTopicsByCourseId(String courseId) {
        return CoursesApi.super.getTopicsByCourseId(courseId);
    }

    @Override
    public ResponseEntity<Void> markLessonCompleted(String studentId, List<Lesson> lesson) {
        return CoursesApi.super.markLessonCompleted(studentId, lesson);
    }
}
