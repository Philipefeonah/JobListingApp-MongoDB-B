package com.maxiflexy.joblistingmongodb.controller;

import com.maxiflexy.joblistingmongodb.model.Post;
import com.maxiflexy.joblistingmongodb.repository.PostRepository;
import com.maxiflexy.joblistingmongodb.repository.SearchRepository;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class PostController {

    @Autowired
    PostRepository postRepository;

    @Autowired
    SearchRepository searchRepository;

    @RequestMapping(value = "/")
    public void redirect(HttpServletResponse response) throws IOException {
        response.sendRedirect("/swagger-ui.html");
    }

    @GetMapping("/get-all-posts")
    public List<Post> getAllPosts(){
        return postRepository.findAll();
    }

    @PostMapping("/post-new-job")
    public Post addPost(@RequestBody Post post){
        return postRepository.save(post);
    }

    @GetMapping("/posts/{text}")
    public List<Post> search(@PathVariable String text){
        return searchRepository.findByText(text);
    }
}
