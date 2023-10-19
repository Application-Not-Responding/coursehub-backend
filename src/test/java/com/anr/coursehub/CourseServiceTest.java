//package com.anr.coursehub;
//
//import com.anr.coursehub.repository.CourseRepository;
//import com.anr.coursehub.service.CourseService;
//import org.junit.Ignore;
//import org.junit.jupiter.api.Test;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.MockitoAnnotations;
//
//import static org.mockito.Mockito.verify;
//
//public class CourseServiceTest {
//
//    @Mock
//    private CourseRepository courseRepository;
//
//    @InjectMocks
//    private CourseService courseService;
//
//    public void setup() {
//        MockitoAnnotations.initMocks(this);
//    }
//
//    @Ignore
//    @Test
//    public void testGetAllCourses() {
//        // Arrange
//
//        // Act
//        courseService.getCourseById(1);
//
//        // Assert
//        verify(courseRepository).findById(1);
//    }
//
//    // Add more test methods for other methods in your service class
//
//}