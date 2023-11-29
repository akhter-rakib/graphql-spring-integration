package com.rakib.graphqlspringintegration.adapter;

import com.rakib.graphqlspringintegration.domain.Post;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class PostController {

    @QueryMapping
    public Post getPost() {
        return new Post("1", "title", "category", "rakib");
    }
}
