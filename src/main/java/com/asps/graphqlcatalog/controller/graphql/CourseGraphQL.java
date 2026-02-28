package com.asps.graphqlcatalog.controller.graphql;

import com.asps.graphqlcatalog.dto.input.CreateCourseInput;
import com.asps.graphqlcatalog.entity.Course;
import com.asps.graphqlcatalog.service.CategoryService;
import com.asps.graphqlcatalog.service.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class CourseGraphQL {
    private final CourseService courseService;
    private final CategoryService categoryService;

    @MutationMapping
    public Course createCourse(@Argument CreateCourseInput course){
        return courseService.save(Course.builder()
                        .name(course.getName())
                        .description(course.getDescription())
                        .category(categoryService.findById(course.getCategoryId()))
                .build());
    }
}
