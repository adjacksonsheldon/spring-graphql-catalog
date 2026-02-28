package com.asps.graphqlcatalog.controller.graphql;

import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class HelloWorldGraphQl{

    @QueryMapping
    public String hello(){
        return "Hello GraphQL!";
    }
}
