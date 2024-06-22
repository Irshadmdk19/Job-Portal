package com.irshadmdk.job_portal.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.irshadmdk.job_portal.Repository.PostRepository;
import com.irshadmdk.job_portal.Repository.SearchPostRepository;

import Models.Post;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class PostController {
    @Autowired
    PostRepository repo;
    
    @Autowired
    SearchPostRepository searchRepo;

    @GetMapping("posts")
    public List<Post> getAllPosts(){
        return repo.findAll();
    }

    @PostMapping("post")
    public Post addPost(@RequestBody Post post){
        return repo.save(post);

    }

    @GetMapping("/posts/{text}")
    public List<Post> search(@PathVariable String text){
        return searchRepo.findByText(text);
    }
    

}
