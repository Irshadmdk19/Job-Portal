package com.irshadmdk.job_portal.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import Models.Post;

public interface PostRepository extends MongoRepository<Post, String> {

    
}
