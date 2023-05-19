package com.blogsite.model;


import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "users")
public class User {

    @MongoId(FieldType.OBJECT_ID)
    private Long id;

    private String firstName;

    private String middleName;

    private String lastName;

    private String email;

    private String userPassword;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private Date createdOn;

    private Set<Blog> blogs = new HashSet<>();

    
}
