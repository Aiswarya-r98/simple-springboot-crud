package com.blogsite.model;


import com.blogsite.vo.UserVo;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "articles")
public class Blog {

    @MongoId(FieldType.OBJECT_ID)
    private Long id;
    private String title;
    private String content;
    private UserVo user;
    private String category;
}
