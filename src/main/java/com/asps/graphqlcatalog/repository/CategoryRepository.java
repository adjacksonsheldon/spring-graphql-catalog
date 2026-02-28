package com.asps.graphqlcatalog.repository;

import com.asps.graphqlcatalog.document.Category;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CategoryRepository extends MongoRepository<Category, String> {
}