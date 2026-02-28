package com.asps.graphqlcatalog.service;

import com.asps.graphqlcatalog.entity.Course;
import com.asps.graphqlcatalog.repository.CourseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CourseService {
    private final CourseRepository repository;

    public Course save(Course course){
        return repository.save(course);
    }

    public Course findById(Long id) {
        return repository.findById(id).orElse(null);
    }
}
