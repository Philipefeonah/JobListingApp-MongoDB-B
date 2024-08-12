package com.maxiflexy.joblistingmongodb.repository;

import com.maxiflexy.joblistingmongodb.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post, String> {

}
