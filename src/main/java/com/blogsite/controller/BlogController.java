package com.blogsite.controller;

import com.blogsite.model.Blog;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1.0/blogsite/blog")
public class BlogController {


    //TODO
    @GetMapping("/getall")
    public ResponseEntity<List<Blog>> ping() {
        return null;
    }

}
