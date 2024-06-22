package com.irshadmdk.job_portal.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.convert.MongoConverter;
import org.springframework.stereotype.Component;

import com.mongodb.client.AggregateIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import Models.Post;

@Component
public class SearchPostRepoImplementation implements SearchPostRepository {

    @Autowired
    MongoClient client;

    @Autowired
    MongoConverter converter;
    @Override
    public List<Post> findByText(String text) {

        final List<Post> posts = new ArrayList<>();
        MongoDatabase database = client.getDatabase("job_portal");
        MongoCollection<Document> collection = database.getCollection("JobPost");
        AggregateIterable<Document> result = collection.aggregate(Arrays.asList(new Document("$search",
                new Document("text", 
                new Document("query", text).append("path", Arrays.asList("techs", "desc", "profile")))),
                new Document("$sort",
                new Document("exp", 1L)),
                new Document("$limit", 5L)));

        result.forEach(doc -> posts.add(converter.read(Post.class, doc)));
        return posts;
    }

}
