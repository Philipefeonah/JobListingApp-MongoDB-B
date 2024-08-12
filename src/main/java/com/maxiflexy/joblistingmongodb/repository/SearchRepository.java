package com.maxiflexy.joblistingmongodb.repository;

import com.maxiflexy.joblistingmongodb.model.Post;

import java.util.List;

public interface SearchRepository {

    List<Post> findByText(String text);
}
