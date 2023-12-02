package com.rakib.graphqlspringintegration.adapter;

import com.rakib.graphqlspringintegration.domain.Post;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.UUID;

@Controller
public class PostController {

    @QueryMapping
    public Post getPost() {
        return new Post(UUID.randomUUID().toString(), "title", "category", "rakib");
    }

    @QueryMapping
    public Post getPostById(@Argument String authorId) {
        return postList().stream().filter(post -> post.getId().equals(authorId)).findFirst().orElse(null);
    }

    @MutationMapping
    public Post savePost(@Argument String title, @Argument String category, @Argument String authorId) {
        return new Post(UUID.randomUUID().toString(), title, category, authorId);
    }

    private List<Post> postList() {
        return List.of(
                new Post("e58ed763-928c-4155-bee9-fdbaaadc15f3", "title", "Master", "rakib"),
                new Post("e58ed768-928c-4155-bee9-fdbaaadc15f5", "title", "Boss", "Sakib")
        );
    }
}
