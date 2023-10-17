package com.anr.coursehub.mapper;

import com.anr.coursehub.model.CourseModel;
import com.anr.openapi.model.Course;
import org.mapstruct.Mapper;

@Mapper
public interface CourseOpenApiMapper {

    CourseModel toEntityFromOpenApi(Course course);

    Course fromEntityToOpenApi(CourseModel courseModel);

}
