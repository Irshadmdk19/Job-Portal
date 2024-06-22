package com.irshadmdk.job_portal.Repository;

import java.util.List;

import Models.Post;

public interface SearchPostRepository {
   List<Post>findByText(String text);
}
