package com.irshadmdk.job_portal.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.irshadmdk.job_portal.PostRepository;

import Models.Post;

@RestController
public class PostController {
    @Autowired
    PostRepository repo;

    @GetMapping("posts")
    public List<Post> getAllPosts(){
        return repo.findAll();
    }
}
