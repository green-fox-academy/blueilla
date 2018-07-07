package com.greenfoxacademy.thereddit.service;

import com.greenfoxacademy.thereddit.model.Post;
import com.greenfoxacademy.thereddit.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

  @Autowired
  PostRepository postRepository;

  public void savePost(Post post) {
    postRepository.save(post);
  }

  public Post findPostById(long id) {
   return postRepository.findById(id).get();
  }

  public List<Post> findAll() {
    return postRepository.findAll();
  }



}
