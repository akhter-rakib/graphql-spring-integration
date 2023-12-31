package com.rakib.graphqlspringintegration.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Post {
    private String id;
    private String title;
    private String category;
    private String authorId;
}
