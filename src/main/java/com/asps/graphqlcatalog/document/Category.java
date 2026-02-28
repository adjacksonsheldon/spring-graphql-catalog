package com.asps.graphqlcatalog.document;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Builder
@Document(collection = "categories")
public class Category {

    @Id
    private String id;
    private String name;
    private String description;

}