package com.asps.graphqlcatalog.service;

import com.asps.graphqlcatalog.entity.Course;
import com.asps.graphqlcatalog.repository.CourseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CourseService {
    private final CourseRepository repository;

    public Course save(Course course){
        return repository.save(course);
    }

    public List<Course> findAll(){
        return repository.findAll();
    }

    public Course findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Boolean deleteById(Long id) {
        final var course = repository.findById(id);

        if(course.isEmpty()){
            return false;
        }

        repository.deleteById(id);
        return true;
    }
}
