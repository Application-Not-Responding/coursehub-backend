package com.anr.coursehub.mapper.configuration;

import com.anr.coursehub.mapper.CourseOpenApiMapper;
import com.anr.coursehub.mapper.CourseOpenApiMapperImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CourseOpenApiMapperConfig {
    @Bean
    public CourseOpenApiMapper appUserOpenApiMapper() {
        return new CourseOpenApiMapperImpl();
    }
}
