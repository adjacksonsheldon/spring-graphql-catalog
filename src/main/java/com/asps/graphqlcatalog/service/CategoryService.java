package com.asps.graphqlcatalog.service;

import com.asps.graphqlcatalog.entity.Category;
import com.asps.graphqlcatalog.exception.CategoryNotFoundException;
import com.asps.graphqlcatalog.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryService {

    private final CategoryRepository repository;

    public Category save(Category category){
        return repository.save(category);
    }

    public Category findById(Long id) {
        return repository.findById(id).orElseThrow(CategoryNotFoundException::new);
    }

    public List<Category> findAll() {
        return repository.findAll();
    }

    public Boolean deleteById(Long id) {
        final var category = repository.findById(id);

        if(category.isEmpty()){
            return false;
        }

        repository.deleteById(id);
        return true;
    }
}
