//package com.anr.coursehub;
//
//import com.anr.coursehub.controller.CourseController;
//import com.anr.coursehub.model.CourseModel;
//import com.anr.coursehub.service.CourseService;
//import com.anr.openapi.model.NewCourseRequest;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import org.junit.jupiter.api.Test;
//import org.junit.Ignore;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.http.MediaType;
//import org.springframework.test.web.servlet.MockMvc;
//
//import static org.mockito.ArgumentMatchers.any;
//import static org.mockito.ArgumentMatchers.anyInt;
//import static org.mockito.Mockito.when;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
//import static org.hamcrest.Matchers.is;
//
//@WebMvcTest(CourseController.class)
//public class CourseControllerTest {
//
//    @Autowired
//    private MockMvc mockMvc;
//
//    @Mock
//    private CourseService courseService;
//
//    @InjectMocks
//    private CourseController courseController;
//
//    @Ignore
//    @Test
//    public void testGetCourseByIdWhenValidIdThenReturnCourse() throws Exception {
//        CourseModel courseModel = new CourseModel();
//        courseModel.setId(1);
//        courseModel.setName("Test Course");
//
//        when(courseService.getCourseById(anyInt())).thenReturn(courseModel);
//
//        mockMvc.perform(get("/courses/{id}", 1))
//                .andExpect(status().isOk())
//                .andExpect(jsonPath("$.id", is(1)))
//                .andExpect(jsonPath("$.name", is("Test Course")));
//    }
//
//    @Ignore
//    @Test
//    public void testAddCourseWhenValidCourseThenReturnAddedCourse() throws Exception {
//        CourseModel courseModel = new CourseModel();
//        courseModel.setId(1);
//        courseModel.setName("Test Course");
//
//        NewCourseRequest newCourseRequest = new NewCourseRequest();
//        newCourseRequest.setName("Test Course");
//        newCourseRequest.setOwnerId(1);
//
//        when(courseService.addCourse(anyInt(), any(NewCourseRequest.class))).thenReturn(courseModel);
//
//        ObjectMapper objectMapper = new ObjectMapper();
//        String newCourseRequestJson = objectMapper.writeValueAsString(newCourseRequest);
//
//        mockMvc.perform(post("/courses")
//                        .contentType(MediaType.APPLICATION_JSON)
//                        .content(newCourseRequestJson))
//                .andExpect(status().isOk())
//                .andExpect(jsonPath("$.id", is(1)))
//                .andExpect(jsonPath("$.name", is("Test Course")));
//    }
//}